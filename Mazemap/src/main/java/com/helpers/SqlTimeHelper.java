package com.helpers;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;


//@Author s183051, s170899
public final class SqlTimeHelper extends JsonDeserializer<java.sql.Time> {

    @Override
    public java.sql.Time deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);
        String time = node.textValue();
        if(time.length() == 5)
        	time = time + ":00";
        return java.sql.Time.valueOf(time);
    }

}
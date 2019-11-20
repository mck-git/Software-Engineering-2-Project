package com.repositories;
import com.models.*;
import java.util.List;
import org.springframework.data.repository.*;

public interface FilteredUserRepository extends CrudRepository<User, Integer>{
	  List<User> findUsersByEmail(String email);
	  User findUserByEmail(String email);
}

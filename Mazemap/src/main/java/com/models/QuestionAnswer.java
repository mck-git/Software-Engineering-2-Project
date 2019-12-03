// Relates to one Question in a specific survey
package com.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "question","surveyAnswer"})

@Entity
public class QuestionAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer number; // what number in the survey.
    private QuestionType questionType;
    private String text;
    private Integer range_answer;
    private Integer text_answer;

    public Integer getId() {
        return id;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    public void setQuestion(Question question) {
        this.question = question;
    }


    public Question getQuestion() {
        return question;
    }


    @ManyToOne
    @JoinColumn(name = "surveyAnswer_id")
    private SurveyAnswer surveyAnswer;

    public SurveyAnswer getSurveyAnswer() {
        return surveyAnswer;
    }

    public void setSurveyAnswer(SurveyAnswer surveyAnswer) {
        this.surveyAnswer = surveyAnswer;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRange_answer() {
        return range_answer;
    }

    public void setRange_answer(Integer range_answer) {
        this.range_answer = range_answer;
    }

    public Integer getText_answer() {
        return text_answer;
    }

    public void setText_answer(Integer text_answer) {
        this.text_answer = text_answer;
    }

}

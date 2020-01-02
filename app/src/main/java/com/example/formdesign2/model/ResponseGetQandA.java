package com.example.formdesign2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseGetQandA {


    @SerializedName("question_id")
    @Expose
    private String questionId;
    @SerializedName("question")
    @Expose
    private String question;
    @SerializedName("answer_list")
    @Expose
    private List<AnswerList> answerList = null;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<AnswerList> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<AnswerList> answerList) {
        this.answerList = answerList;
    }

}

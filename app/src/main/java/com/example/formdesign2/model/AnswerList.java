package com.example.formdesign2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnswerList {

    @SerializedName("ans_id")
    @Expose
    private String ansId;
    @SerializedName("answer")
    @Expose
    private String answer;
    @SerializedName("answer_score")
    @Expose
    private String answerScore;

    public String getAnsId() {
        return ansId;
    }

    public void setAnsId(String ansId) {
        this.ansId = ansId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswerScore() {
        return answerScore;
    }

    public void setAnswerScore(String answerScore) {
        this.answerScore = answerScore;
    }


}

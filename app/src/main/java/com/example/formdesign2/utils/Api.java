package com.example.formdesign2.utils;

import com.example.formdesign2.model.GetquestionAnswer;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("Api_companyclient/getquestionanswer")
    Call<GetquestionAnswer> getQuestion();


}

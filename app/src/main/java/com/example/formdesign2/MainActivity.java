package com.example.formdesign2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.formdesign2.model.AnswerList;
import com.example.formdesign2.model.GetquestionAnswer;
import com.example.formdesign2.model.ResponseGetQandA;
import com.example.formdesign2.utils.Api;
import com.example.formdesign2.utils.RetrofitHelper;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

RecyclerView recyclerView;

    List<ResponseGetQandA> list = new ArrayList<>();      //This will show data which is received fron OnResponse() of json data

   AnswerList answerlist ;

    QuestionAdapter adapter;      // Adapter of new class

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcview);
        adapter = new QuestionAdapter(this, list);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);



        spinner = findViewById(R.id.answerSpinner);



        getQuestions();
    }



    private void getQuestions() {

        Api api = RetrofitHelper.getRetrofitApi();
        Call<GetquestionAnswer> call = api.getQuestion();

        call.enqueue(new Callback<GetquestionAnswer>() {
            @Override
            public void onResponse(Call<GetquestionAnswer> call, Response<GetquestionAnswer> response) {
                GetquestionAnswer data = response.body();

                Log.e("Tag", "msg" + new Gson().toJson(data));
                list.clear();
                list.addAll(data.getResponse());
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<GetquestionAnswer> call, Throwable t) {

                Log.e("tag", "msg" + t.getMessage());
                Toast.makeText(MainActivity.this, "DATA FETCHING ERROR", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
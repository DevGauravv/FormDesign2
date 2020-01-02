package com.example.formdesign2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.formdesign2.model.AnswerList;
import com.example.formdesign2.model.ResponseGetQandA;


import java.util.List;

class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder> {

    Context context;  //To inflate xml file of Adapter

    List<ResponseGetQandA> list;

    AnswerList answerList;

    LayoutInflater inflater;






    public QuestionAdapter(Context context, List<ResponseGetQandA> list) {
        this.context = context;
        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.questionanswer, parent, false);

        return new QuestionViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionViewHolder holder, int position) {

         final  ResponseGetQandA item = list.get(position);



         holder.questiontxt.setText(item.getQuestion());

         


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class  QuestionViewHolder extends RecyclerView.ViewHolder{


        TextView questiontxt;
        Spinner spinner;

        public QuestionViewHolder(@NonNull View itemView) {
            super(itemView);

            questiontxt = itemView.findViewById(R.id.questionView);
            spinner = itemView.findViewById(R.id.answerSpinner);


        }
    }
}

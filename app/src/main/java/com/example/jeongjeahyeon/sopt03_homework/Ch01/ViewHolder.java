package com.example.jeongjeahyeon.sopt03_homework.Ch01;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.jeongjeahyeon.sopt03_homework.R;


/**
 * Created by kh on 2016. 10. 24..
 */
public class ViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public ViewHolder(View itemView) {
        super(itemView);

        textView = (TextView)itemView.findViewById(R.id.textview1);

    }
}
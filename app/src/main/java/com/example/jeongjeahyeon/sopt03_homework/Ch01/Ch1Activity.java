package com.example.jeongjeahyeon.sopt03_homework.Ch01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jeongjeahyeon.sopt03_homework.R;

import java.util.ArrayList;

public class Ch1Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> mDatas = new ArrayList<String>();
    ArrayList<String> tmpData = new ArrayList<>();
    LinearLayoutManager mLayoutManager;

    Button addbtn, delbtn;
    EditText editText, editText2;
    String text;
    Ch1Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch1);

        /**
         * 1. recyclerview 초기화
         */
        recyclerView = (RecyclerView) findViewById(R.id.recylerView);
        editText = (EditText) findViewById(R.id.et);
        editText2 = (EditText) findViewById(R.id.et2);
        addbtn = (Button)findViewById(R.id.addbtn);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = editText.getText().toString();
                mDatas.add(text);
                adapter = new Ch1Adapter(mDatas, Ch1Activity.this);

                recyclerView.setAdapter(adapter);
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!editText2.getText().toString().isEmpty() || !editText2.getText().toString().equals("")) {
                    text = editText2.getText().toString();
                    for (int i = 0; i < mDatas.size(); i++) {
                        if (mDatas.get(i).equals(text)) {
                            tmpData.clear();
                            tmpData.add(mDatas.get(i));
                            adapter = new Ch1Adapter(tmpData, Ch1Activity.this);
                            recyclerView.setAdapter(adapter);
                        } else {
                            tmpData.clear();
                            adapter = new Ch1Adapter(tmpData, Ch1Activity.this);
                            recyclerView.setAdapter(adapter);
                        }
                    }
                } else {
                    adapter = new Ch1Adapter(mDatas, Ch1Activity.this);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        //각 item의 크기가 일정할 경우 고정
        recyclerView.setHasFixedSize(true);


        //TODO LayoutManager 초기화
        // layoutManager 설정
        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLayoutManager);

        /**
         * 2. recyclerview에 보여줄 data
         */
        mDatas.add("List1");
        mDatas.add("List2");
        mDatas.add("List3");
        mDatas.add("List4");
        mDatas.add("List5");


        /**
         * 3. Adapter 생성 후 recyclerview에 지정
         */
        adapter = new Ch1Adapter(mDatas, Ch1Activity.this);

        recyclerView.setAdapter(adapter);
    }

}

package com.example.jeongjeahyeon.sopt03_homework.Ch02;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jeongjeahyeon.sopt03_homework.R;

import java.util.ArrayList;


/**
 * Created by kh on 2016. 10. 24..
 */
public class Ch2Adapter extends RecyclerView.Adapter<ViewHolder>{

    public Ch2Adapter() {
    }

    ArrayList<ItemDatas> mDatas;
    View.OnClickListener mOnClickListener;

    public Ch2Adapter(ArrayList<ItemDatas> mDatas, View.OnClickListener mOnClickListener) {
        this.mDatas = mDatas;
        this.mOnClickListener = mOnClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_2, parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        itemView.setOnClickListener(mOnClickListener);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageView.setImageResource(mDatas.get(position).image);
        holder.titleView.setText(mDatas.get(position).title);
        holder.contentView.setText(mDatas.get(position).content);

    }

    @Override
    public int getItemCount() {
        return (mDatas != null) ? mDatas.size() : 0;
    }

}

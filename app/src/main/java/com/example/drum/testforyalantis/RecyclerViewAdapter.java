package com.example.drum.testforyalantis;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by drum on 18.03.2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private int[] mImages;
    private Context context;


    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView icon;

        public ViewHolder(View itemView) {
            super(itemView);
            icon = (ImageView) itemView;
        }

    }

    public RecyclerViewAdapter(Context context, int[] mImages) {
        this.mImages = mImages;
        this.context = context;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = new ImageView(context);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Picasso.with(context)
                .load(mImages[position])
                .resize(300, 300)
                .into(holder.icon);
    }

    @Override
    public int getItemCount() {
        return mImages.length;
    }

//    @Override
//    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
//        super.onAttachedToRecyclerView(recyclerView);
//    }
}

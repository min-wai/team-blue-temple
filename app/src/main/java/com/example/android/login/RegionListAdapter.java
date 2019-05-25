package com.example.android.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class RegionListAdapter extends RecyclerView.Adapter<RegionListAdapter.CardViewHolder> {
    Context context;
    int size;
    String[] titleStrings;
    String[] imageUrls;

    RegionListAdapter(Context context) {
        this.context = context;
        this.size = context.getResources().getStringArray(R.array.region_image_titles).length;
        titleStrings = context.getResources().getStringArray(R.array.region_image_titles);
        imageUrls = context.getResources().getStringArray(R.array.region_image_urls);
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.region_card, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.title.setText(titleStrings[position]);
        Glide.with(context).load(imageUrls[position]).into(holder.regionImage);
    }

    @Override
    public int getItemCount() {
        return size;
    }

    class CardViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView regionImage;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.region_title);
            regionImage = (ImageView) itemView.findViewById(R.id.region_image);
        }
    }
}

package com.delta.familyradar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ReceivedRecyclerAdapter extends RecyclerView.Adapter<ReceivedRecyclerAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.received_card, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idTxt.setText("mamaad");
        holder.timeTxt.setText("20:20");
        holder.dateTxt.setText("12/3/2020");


    }


    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView idTxt;
        private TextView dateTxt;
        private TextView timeTxt;
        private ImageView proPic;
        private Button acButton;
        private Button dcButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTxt = itemView.findViewById(R.id.idTxt);
            dateTxt = itemView.findViewById(R.id.dateTxt);
            timeTxt = itemView.findViewById(R.id.timeTxt);
            proPic = itemView.findViewById(R.id.proPicImage);
            acButton = itemView.findViewById(R.id.acBtn);
            dcButton = itemView.findViewById(R.id.dcBtn);
        }
    }
}

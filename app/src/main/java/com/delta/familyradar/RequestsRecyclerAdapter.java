package com.delta.familyradar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RequestsRecyclerAdapter extends RecyclerView.Adapter<RequestsRecyclerAdapter.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.request_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.receiver.setText("ffafada");
        holder.date.setText("13/8/1378");
        holder.time.setText("3:16");
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView receiver;
        private TextView date;
        private TextView time;
        private ImageView proPic;
        private Button situationButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            receiver = itemView.findViewById(R.id.rcvTxt);
            date = itemView.findViewById(R.id.dateRcvTxt);
            time = itemView.findViewById(R.id.timeRcvTxt);
            proPic = itemView.findViewById(R.id.proPicRcvImage);
            situationButton = itemView.findViewById(R.id.situationBtn);
        }
    }
}

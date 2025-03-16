package com.example.remidirecycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class makananAdapter extends RecyclerView.Adapter<makananAdapter.ViewHolder> {

    private List<ModalMakanan> makananList;
    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ModalMakanan makananModel);
    }

    public makananAdapter(ArrayList<ModalMakanan> makananList, MainActivity listener) {
        this.makananList = makananList;
         this.listener = (OnItemClickListener) listener;
    }

    //copy gpt dan return jangan null
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate layout item untuk RecyclerView
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Mengisi data ke TextView
        ModalMakanan makananmodel = this.makananList.get(position);
        holder.tvMakanan.setText(makananmodel.getNamaMakanan());
        holder.tvHarga.setText(makananmodel.getHargaMakanan());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(makananmodel));
        holder.imgMakanan.setImageResource(makananmodel.getGambarMakanan());
    }

    @Override
    public int getItemCount() {
        return this.makananList.size();
    }

    // ViewHolder harus berada di dalam class Adapter
    // inner class
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvMakanan;
        TextView tvHarga;

        ImageView imgMakanan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMakanan = itemView.findViewById(R.id.tvMakanan);
            tvHarga = itemView.findViewById(R.id.hargamakanan);

            imgMakanan = itemView.findViewById(R.id.imgMakanan);
        }
    }
}

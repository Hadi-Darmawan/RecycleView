package com.example.recycleviews;

import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private Context context;
    private List<WishList> Wish;

    public myAdapter(Context context, List<WishList> Wish) {
        this.context = context;
        this.Wish = Wish;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama, deskripsi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = (TextView)itemView.findViewById(R.id.nama);
            deskripsi = (TextView)itemView.findViewById(R.id.deskripsi);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.activity_blue_print_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WishList pu =Wish.get(position);
        holder.nama.setText(pu.getNama());
        holder.deskripsi.setText(pu.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return Wish.size();
    }


}

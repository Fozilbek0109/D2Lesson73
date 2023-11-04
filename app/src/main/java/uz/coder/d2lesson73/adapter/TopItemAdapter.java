package uz.coder.d2lesson73.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.coder.d2lesson73.databinding.ItemTopLayoutBinding;
import uz.coder.d2lesson73.models.TopItem;

public class TopItemAdapter extends RecyclerView.Adapter<TopItemAdapter.VH> {
    private List<TopItem> topItemList;

    public TopItemAdapter(List<TopItem> topItemList) {
        this.topItemList = topItemList;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ItemTopLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.itemTopLayoutBinding.img.setImageResource(topItemList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return topItemList.size();
    }

    public  static class VH extends RecyclerView.ViewHolder {
        private ItemTopLayoutBinding itemTopLayoutBinding;
        public VH(@NonNull ItemTopLayoutBinding binding) {
            super(binding.getRoot());
            this.itemTopLayoutBinding = binding;
        }
    }
}

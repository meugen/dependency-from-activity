package meugeninua.dependencyfromactivity.ui.fragments.items.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import meugeninua.dependencyfromactivity.R;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemHolder> {

    private final LayoutInflater inflater;
    private List<String> items;

    public ItemsAdapter(final Context context) {
        this.inflater = LayoutInflater.from(context);
        this.items = Collections.emptyList();
    }

    public void swapItems(final List<String> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemHolder holder, final int position) {
        holder.textView.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ItemHolder extends RecyclerView.ViewHolder {

        final TextView textView;

        ItemHolder(@NonNull final View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }
}

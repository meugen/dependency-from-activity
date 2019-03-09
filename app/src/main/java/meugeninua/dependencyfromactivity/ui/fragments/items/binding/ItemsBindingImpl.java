package meugeninua.dependencyfromactivity.ui.fragments.items.binding;

import android.content.Context;

import java.util.List;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import meugeninua.dependencyfromactivity.R;
import meugeninua.dependencyfromactivity.ui.fragments.base.binding.BaseBindingImpl;
import meugeninua.dependencyfromactivity.ui.fragments.items.adapters.ItemsAdapter;

public class ItemsBindingImpl extends BaseBindingImpl implements ItemsBinding {

    private ItemsAdapter adapter;

    @Override
    public void setupRecycler(final Context context) {
        RecyclerView recyclerView = get(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new DividerItemDecoration(context,
                DividerItemDecoration.VERTICAL));
        adapter = new ItemsAdapter(context);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void swapItems(final List<String> items) {
        adapter.swapItems(items);
    }
}

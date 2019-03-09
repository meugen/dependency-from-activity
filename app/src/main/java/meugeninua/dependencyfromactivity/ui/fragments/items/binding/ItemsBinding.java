package meugeninua.dependencyfromactivity.ui.fragments.items.binding;

import android.content.Context;

import java.util.List;

import meugeninua.dependencyfromactivity.ui.fragments.base.binding.Binding;

public interface ItemsBinding extends Binding {

    void setupRecycler(Context context);

    void swapItems(List<String> items);
}

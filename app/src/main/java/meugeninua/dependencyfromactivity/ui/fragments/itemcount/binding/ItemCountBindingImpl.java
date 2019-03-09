package meugeninua.dependencyfromactivity.ui.fragments.itemcount.binding;

import android.content.res.Resources;
import android.widget.TextView;

import meugeninua.dependencyfromactivity.R;
import meugeninua.dependencyfromactivity.ui.fragments.base.binding.BaseBindingImpl;

public class ItemCountBindingImpl extends BaseBindingImpl implements ItemCountBinding {

    private final Resources resources;

    public ItemCountBindingImpl(final Resources resources) {
        this.resources = resources;
    }

    @Override
    public void displayItemCount(final int count) {
        this.<TextView>get(R.id.item_count_label).setText(resources
                .getString(R.string.item_count_label, count));
    }
}

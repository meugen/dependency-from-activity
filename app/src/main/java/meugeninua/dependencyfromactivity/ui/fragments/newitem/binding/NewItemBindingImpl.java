package meugeninua.dependencyfromactivity.ui.fragments.newitem.binding;

import android.view.View;
import android.widget.EditText;

import java.lang.ref.WeakReference;

import meugeninua.dependencyfromactivity.R;
import meugeninua.dependencyfromactivity.ui.fragments.base.binding.BaseBindingImpl;

public class NewItemBindingImpl extends BaseBindingImpl implements NewItemBinding {

    @Override
    public void setupAddNewItemListener(final OnAddNewItemListener listener) {
        get(R.id.button_add).setOnClickListener(new AddItemClickListener(listener, this));
    }

    private static class AddItemClickListener implements View.OnClickListener {

        private final WeakReference<OnAddNewItemListener> listenerRef;
        private final WeakReference<NewItemBinding> bindingRef;

        AddItemClickListener(
                final OnAddNewItemListener listener,
                final NewItemBinding binding) {
            listenerRef = new WeakReference<>(listener);
            bindingRef = new WeakReference<>(binding);
        }

        @Override
        public void onClick(final View view) {
            OnAddNewItemListener listener = listenerRef.get();
            NewItemBinding binding = bindingRef.get();
            if (listener == null || binding == null) {
                return;
            }
            listener.onAddNewItem(binding.<EditText>get(R.id.edit_item).getText());
        }
    }
}

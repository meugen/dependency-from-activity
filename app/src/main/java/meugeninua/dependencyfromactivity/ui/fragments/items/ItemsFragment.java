package meugeninua.dependencyfromactivity.ui.fragments.items;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import meugeninua.dependencyfromactivity.R;
import meugeninua.dependencyfromactivity.ui.activities.main.viewmodel.MainViewModel;
import meugeninua.dependencyfromactivity.ui.di.MainComponent;
import meugeninua.dependencyfromactivity.ui.fragments.base.BaseFragment;
import meugeninua.dependencyfromactivity.ui.fragments.items.binding.ItemsBinding;
import meugeninua.dependencyfromactivity.ui.fragments.items.binding.ItemsBindingImpl;

public class ItemsFragment extends BaseFragment<MainComponent, ItemsBinding> {

    private MainViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull final LayoutInflater inflater,
            @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_items,
                container, false);
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        binding.setupRecycler(getContext());
        viewModel.getItemsLiveData().observe(this, binding::swapItems);
    }

    @Override
    protected void inject(final MainComponent component) {
        viewModel = component.provideMainViewModel();
        binding = new ItemsBindingImpl();
    }
}

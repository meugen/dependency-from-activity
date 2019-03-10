package meugeninua.dependencyfromactivity.ui.fragments.itemcount;

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
import meugeninua.dependencyfromactivity.ui.fragments.itemcount.binding.ItemCountBinding;
import meugeninua.dependencyfromactivity.ui.fragments.itemcount.binding.ItemCountBindingImpl;

public class ItemCountFragment extends BaseFragment<MainComponent, ItemCountBinding> {

    private MainViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull final LayoutInflater inflater,
            @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_count,
                container, false);
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        viewModel.getItemsLiveData().observe(this,
                items -> binding.displayItemCount(items.size()));
    }

    @Override
    public void inject(final MainComponent component) {
        viewModel = component.provideMainViewModel();
        binding = new ItemCountBindingImpl(getResources());
    }
}

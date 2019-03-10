package meugeninua.dependencyfromactivity.ui.fragments.newitem;

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
import meugeninua.dependencyfromactivity.ui.fragments.newitem.binding.NewItemBinding;
import meugeninua.dependencyfromactivity.ui.fragments.newitem.binding.NewItemBindingImpl;
import meugeninua.dependencyfromactivity.ui.fragments.newitem.binding.OnAddNewItemListener;

public class NewItemFragment extends BaseFragment<MainComponent, NewItemBinding>
        implements OnAddNewItemListener {

    private MainViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull final LayoutInflater inflater,
            @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_new_item,
                container, false);
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        binding.setupAddNewItemListener(this);
    }

    @Override
    public void onAddNewItem(final CharSequence item) {
        viewModel.addItem(item);
    }

    @Override
    public void inject(final MainComponent component) {
        binding = new NewItemBindingImpl();
        viewModel = component.provideMainViewModel();
    }
}

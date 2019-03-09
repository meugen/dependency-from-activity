package meugeninua.dependencyfromactivity.app.di.impls;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import meugeninua.dependencyfromactivity.app.di.AppComponent;
import meugeninua.dependencyfromactivity.app.di.Injectable;

public class ViewModelFactoryImpl extends ViewModelProvider.NewInstanceFactory {

    private final AppComponent appComponent;

    public ViewModelFactoryImpl(final AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull final Class<T> modelClass) {
        T viewModel =  super.create(modelClass);
        if (viewModel instanceof Injectable) {
            ((Injectable<AppComponent>) viewModel).inject(appComponent);
        }
        return viewModel;
    }
}

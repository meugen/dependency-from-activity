package meugeninua.dependencyfromactivity.ui.fragments.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import meugeninua.dependencyfromactivity.app.di.Injectable;
import meugeninua.dependencyfromactivity.ui.di.ActivityComponent;
import meugeninua.dependencyfromactivity.ui.fragments.base.binding.Binding;

public abstract class BaseFragment<C extends ActivityComponent, B extends Binding> extends Fragment
        implements Injectable<C> {

    protected B binding;

    @Override
    public void onAttach(final Context context) {
        ActivityComponent.Container<C> container = (ActivityComponent.Container<C>) context;
        inject(container.provideActivityComponent());
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(
            @NonNull final View view,
            @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.attachView(view);
    }

    @Override
    public void onDestroyView() {
        binding.detachView();
        super.onDestroyView();
    }
}

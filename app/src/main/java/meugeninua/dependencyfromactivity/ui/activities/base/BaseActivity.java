package meugeninua.dependencyfromactivity.ui.activities.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import meugeninua.dependencyfromactivity.app.DependencyApp;
import meugeninua.dependencyfromactivity.app.di.AppComponent;
import meugeninua.dependencyfromactivity.ui.di.ActivityComponent;

public abstract class BaseActivity<C extends ActivityComponent> extends AppCompatActivity
        implements ActivityComponent.Container<C> {

    private C component;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        component = createActivityComponent(DependencyApp.provideAppComponent(this));
    }

    @Override
    public C provideActivityComponent() {
        return component;
    }

    protected abstract C createActivityComponent(final AppComponent appComponent);
}

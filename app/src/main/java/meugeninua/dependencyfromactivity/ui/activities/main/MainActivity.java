package meugeninua.dependencyfromactivity.ui.activities.main;

import android.os.Bundle;

import meugeninua.dependencyfromactivity.R;
import meugeninua.dependencyfromactivity.app.di.AppComponent;
import meugeninua.dependencyfromactivity.ui.activities.base.BaseActivity;
import meugeninua.dependencyfromactivity.ui.di.MainComponent;

public class MainActivity extends BaseActivity<MainComponent> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected MainComponent createActivityComponent(final AppComponent appComponent) {
        return new MainComponentImpl(appComponent, this);
    }
}

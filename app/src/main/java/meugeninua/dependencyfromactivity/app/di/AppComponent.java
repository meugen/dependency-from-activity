package meugeninua.dependencyfromactivity.app.di;

import android.content.Context;

import androidx.lifecycle.ViewModelProvider;

public interface AppComponent {

    Context provideAppContext();

    ViewModelProvider.Factory provideViewModelFactory();
}

package meugeninua.dependencyfromactivity.ui.di;

import android.content.Context;

import androidx.fragment.app.FragmentManager;
import meugeninua.dependencyfromactivity.app.di.AppComponent;

public interface ActivityComponent extends AppComponent {

    Context provideActivityContext();

    FragmentManager provideFragmentManager();

    interface Container<C extends ActivityComponent> {

        C provideActivityComponent();
    }
}

package meugeninua.dependencyfromactivity.ui.di;

import meugeninua.dependencyfromactivity.ui.activities.main.viewmodel.MainViewModel;

public interface MainComponent extends ActivityComponent {

    MainViewModel provideMainViewModel();
}

package meugeninua.dependencyfromactivity.ui.activities.main;

import meugeninua.dependencyfromactivity.app.di.AppComponent;
import meugeninua.dependencyfromactivity.ui.activities.base.BaseComponentImpl;
import meugeninua.dependencyfromactivity.ui.activities.main.viewmodel.MainViewModel;
import meugeninua.dependencyfromactivity.ui.di.MainComponent;

class MainComponentImpl extends BaseComponentImpl<MainActivity>
        implements MainComponent {

    MainComponentImpl(final AppComponent appComponent, final MainActivity activity) {
        super(appComponent, activity);
    }

    @Override
    public MainViewModel provideMainViewModel() {
        return getViewModel(MainViewModel.class);
    }
}

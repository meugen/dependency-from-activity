package meugeninua.dependencyfromactivity.app;

import android.app.Application;
import android.content.Context;

import androidx.annotation.MainThread;
import meugeninua.dependencyfromactivity.app.di.AppComponent;
import meugeninua.dependencyfromactivity.app.di.impls.AppComponentImpl;

public class DependencyApp extends Application {

    @MainThread
    public static AppComponent provideAppComponent(final Context context) {
        DependencyApp app = (DependencyApp) context.getApplicationContext();
        if (app.appComponent == null) {
            app.appComponent = new AppComponentImpl(app);
        }
        return app.appComponent;
    }

    private AppComponent appComponent;
}

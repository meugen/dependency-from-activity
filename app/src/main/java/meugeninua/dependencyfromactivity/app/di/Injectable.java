package meugeninua.dependencyfromactivity.app.di;

public interface Injectable<C extends AppComponent> {

    void inject(C component);
}

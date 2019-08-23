package com.Dagger2Example9CustomScope;

import android.app.Application;
 

 
public class ExampleApp extends Application {
    private AppComponent component;
 
    @Override
    public void onCreate() {
        super.onCreate();
 
        component = DaggerAppComponent.create();
    }
 
    public AppComponent getAppComponent() {
        return component;
    }
}
package com.Dagger2Example12ComponentFactory;

import android.app.Application;
 

 
public class ExampleApp extends Application {
    private AppComponent component;
 
    @Override
    public void onCreate() {
        super.onCreate();
 
        component = DaggerAppComponent.factory().create(new DriverModule("Hans"));
    }
 
    public AppComponent getAppComponent() {
        return component;
    }
}
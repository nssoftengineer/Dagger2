package com.Dagger2Example11SubComponentBuilder;

import javax.inject.Singleton;
 
import dagger.Component;
 
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
 
    ActivityComponent.Builder getActivityComponentBuilder();
}
package com.Dagger2Example9CustomScope;


 
import javax.inject.Singleton;
 
import dagger.Component;
 
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
 
    Driver getDriver();
}
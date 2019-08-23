package com.Dagger2Example6StateFullModule;


 
import dagger.Component;
 
@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
 
    Car getCar();
 
    void inject(MainActivity mainActivity);
}
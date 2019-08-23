package com.Dagger2Example4ModuleProvider;

import dagger.Component;
 
@Component(modules = WheelsModule.class)
public interface CarComponent {
 
    Car getCar();
 
    void inject(MainActivity mainActivity);
}
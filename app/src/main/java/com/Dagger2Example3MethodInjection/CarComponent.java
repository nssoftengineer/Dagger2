package com.Dagger2Example3MethodInjection;

import dagger.Component;
 
@Component
public interface CarComponent {
 
    Car getCar();
 
    void inject(MainActivity mainActivity);
}
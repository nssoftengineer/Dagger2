package com.Dagger2Example2FieldInjection;

import dagger.Component;
 
@Component
public interface CarComponent {
 
    Car getCar();
 
    void inject(MainActivity mainActivity);
}
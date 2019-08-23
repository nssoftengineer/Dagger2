package com.Dagger2Example5Binds;


 
import dagger.Binds;
import dagger.Module;
 
@Module
public abstract class DieselEngineModule {
 
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
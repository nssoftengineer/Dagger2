package com.Dagger2Example10SubComponents;


 
import dagger.Binds;
import dagger.Module;
 
@Module
public abstract class PetrolEngineModule {
 
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
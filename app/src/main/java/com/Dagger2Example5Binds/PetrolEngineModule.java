package com.Dagger2Example5Binds;


 
import dagger.Binds;
import dagger.Module;
 
@Module
public abstract class PetrolEngineModule {
 
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
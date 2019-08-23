package com.Dagger2Example6StateFullModule;

 
import dagger.Module;
import dagger.Provides;
 
@Module
public class DieselEngineModule {
    private int horsePower;
 
    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }
 
    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}
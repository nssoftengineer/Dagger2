package com.Dagger2Example12ComponentFactory;


 
import javax.inject.Named;
 
import dagger.BindsInstance;
import dagger.Subcomponent;
 
@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
 
    Car getCar();
 
    void inject(MainActivity mainActivity);
 
 
    @Subcomponent.Factory
    interface Factory {
 
        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower,
                                 @BindsInstance @Named("engine capacity") int engineCapacity);
    }
}
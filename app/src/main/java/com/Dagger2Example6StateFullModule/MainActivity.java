package com.Dagger2Example6StateFullModule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example1.dagger2.R;

import javax.inject.Inject;
 
public class MainActivity extends AppCompatActivity {
    @Inject Car car;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();
 
        component.inject(this);
 
        car.drive();
    }
}
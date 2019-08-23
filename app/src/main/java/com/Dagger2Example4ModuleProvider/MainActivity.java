package com.Dagger2Example4ModuleProvider;

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
 
        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
 
        car.drive();
    }
}
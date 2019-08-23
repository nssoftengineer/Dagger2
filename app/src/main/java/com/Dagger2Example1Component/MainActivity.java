package com.Dagger2Example1Component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example1.dagger2.R;



public class MainActivity extends AppCompatActivity {
    private Car car;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();

        car = component.getCar();
        car.drive();
    }
}
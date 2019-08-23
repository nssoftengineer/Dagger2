package com.Dagger2Example12ComponentFactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
 

import com.example1.dagger2.R;

import javax.inject.Inject;
 
public class MainActivity extends AppCompatActivity {
    @Inject Car car1, car2;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory().create(150, 1400);
 
        component.inject(this);
 
        car1.drive();
        car2.drive();
    }
}
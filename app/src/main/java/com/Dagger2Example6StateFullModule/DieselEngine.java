package com.Dagger2Example6StateFullModule;

import android.util.Log;
 
public class DieselEngine implements Engine {
    private static final String TAG = "Car";
 
    private int horsePower;
 
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }
 
    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horsepower: " + horsePower);
    }
}
package com.example.ab.receiver;

import android.app.Application;
import android.util.Log;

public class App extends Application {
    private static final String TAG = App.class.getSimpleName();

    private static int counter;

    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate " + counter);
        counter++;
    }
}


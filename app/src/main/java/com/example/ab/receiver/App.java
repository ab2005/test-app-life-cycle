package com.example.ab.receiver;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


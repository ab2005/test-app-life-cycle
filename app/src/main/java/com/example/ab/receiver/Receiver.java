package com.example.ab.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ab on 8/13/16.
 */
public class Receiver extends BroadcastReceiver {
    private static final String TAG = Receiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive " + context.getPackageName());
    }
}

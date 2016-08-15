package com.example.ab.receiver;

import android.app.Activity;

/**
 * This class is needed only to validate the app.
 * Android requires user to launch the app explicitly before any of it's componets coul be used.
 */
public class Installer extends Activity {
    @Override
    protected void onStart() {
        super.onStart();
        System.exit(0);
    }
}

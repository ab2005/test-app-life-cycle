package com.example.ab.receiver;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ab on 8/13/16.
 */
public class Installer extends Activity {
    @Override
    protected void onStart() {
        super.onStart();
        System.exit(0);
    }
}

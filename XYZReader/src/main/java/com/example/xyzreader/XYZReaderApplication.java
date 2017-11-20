package com.example.xyzreader;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Application class. Initialize Stetho here.
 */

public class XYZReaderApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}

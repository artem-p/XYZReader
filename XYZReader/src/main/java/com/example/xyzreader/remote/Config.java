package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            // https://nspf.github.io/XYZReader/data.json
            // https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json
            // https://raw.githubusercontent.com/artem-p/XYZReader/master/xyz.json
            url = new URL("https://nspf.github.io/XYZReader/data.json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}

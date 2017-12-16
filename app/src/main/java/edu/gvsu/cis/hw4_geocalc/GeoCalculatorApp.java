package edu.gvsu.cis.hw4_geocalc;

import android.app.Application;

import net.danlew.android.joda.JodaTimeAndroid;

/**
 * Created by confl on 11/3/2017.
 */

public class GeoCalculatorApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JodaTimeAndroid.init(this);
    }
}

package me.shkschneider.openlocationcodes.demo;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {

    public static Context CONTEXT;

    @Override
    public void onCreate() {
        super.onCreate();

        CONTEXT = getApplicationContext();
    }

}

package com.androstock.myweatherapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    public static String CITY_ACTION = "com.androstock.myweatherapp.MyReceiver.CITY";
    public static String city = "Mumbai, IN";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //  throw new UnsupportedOperationException("Not yet implemented");
        //broad cast sent from the book club slice is recieved here. and global variable is set with the value received.

        if (intent.getAction().equals(CITY_ACTION)) {
            city = intent.getStringExtra("city");
        }
    }
    }


package com.example.patelkev.chatapplication;

import android.app.Application;

import com.example.patelkev.chatapplication.Models.Message;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by patelkev on 10/26/16.
 */

public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        setupParse();
    }

    protected void setupParse() {
        String applicationID = "v2h47JpbrF344wVegMYjF8dpiKFGy11UZXWssvSO";
        String parseServer = "https://api.parse.com/1/";

        applicationID = "93bd0b59a90d46b1999e484431b83f41";
        parseServer = "https://simplechatclient.herokuapp.com/parse/";

        ParseObject.registerSubclass(Message.class);

        Parse.initialize( new Parse.Configuration.Builder(this)
                .applicationId(applicationID)
                .clientKey("0fGRmvU9pDv1qoOsWNUbJIuQK9NAhZ1ad3KF61jP")
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server(parseServer)
                .build());
    }
}

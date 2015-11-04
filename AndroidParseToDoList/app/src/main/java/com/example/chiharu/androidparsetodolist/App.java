package com.example.chiharu.androidparsetodolist;

/**
 * Created by Chiharu on 11/3/2015.
 */
import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, ApplicationID, ClientKey); // Your Application ID and Client Key are defined elsewhere
    }
}

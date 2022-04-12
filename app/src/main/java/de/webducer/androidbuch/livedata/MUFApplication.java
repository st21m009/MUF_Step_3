package de.webducer.androidbuch.livedata;

import android.app.Application;

import androidx.room.Room;

public class MUFApplication extends Application {

    private Database database;

    @Override
    public void onCreate() {
        super.onCreate();
        database= Room.databaseBuilder(this,Database.class,"muf").build();
    }

    public Database getDatabase(){
        return database;
    }


}

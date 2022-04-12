package de.webducer.androidbuch.livedata;

import androidx.room.RoomDatabase;

import de.webducer.androidbuch.livedata.dao.UserDao;
import de.webducer.androidbuch.livedata.data.User;

@androidx.room.Database(entities = {User.class},version = 1)
public abstract class Database extends RoomDatabase {

    public abstract UserDao getUserDao();

}

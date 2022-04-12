package de.webducer.androidbuch.livedata.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import de.webducer.androidbuch.livedata.data.User;

@Dao
public abstract class UserDao {

    @Query("SELECT * FROM user WHERE email=:email")
    public abstract LiveData<User> getUserByEmail(String email);

    @Query("SELECT * FROM user")
    public abstract LiveData<User> getUser();   //Es wird nur der erste User retourniert

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract long insert(User user);





}

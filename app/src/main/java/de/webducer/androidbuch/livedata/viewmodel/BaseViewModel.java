package de.webducer.androidbuch.livedata.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import de.webducer.androidbuch.livedata.Database;
import de.webducer.androidbuch.livedata.MUFApplication;
import de.webducer.androidbuch.livedata.MainActivity;

public abstract class BaseViewModel extends AndroidViewModel {

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    public Database getDatabase(){
        return ((MUFApplication) getApplication()).getDatabase();
    }

}

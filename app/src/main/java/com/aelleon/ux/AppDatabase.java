package com.aelleon.ux;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Alan Liu on 4/6/2018.
 */
@Database(entities = {Child.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ChildDao childDao();
}

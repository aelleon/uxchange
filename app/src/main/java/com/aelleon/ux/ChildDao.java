package com.aelleon.ux;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Alan Liu on 4/6/2018.
 */
@Dao
public interface ChildDao {

    @Query("SELECT * FROM child")
    List<Child> getAll();

    @Query("SELECT * FROM child WHERE uid IN (:childIds)")
    List<Child> loadAllByIds(int[] childIds);

    @Query("SELECT * FROM child WHERE first_name LIKE :first AND "
            + "last_name LIKE :last LIMIT 1")
    Child findByName(String first, String last);
    @Insert
    void insertAll (Child... childs);
    @Delete
    void delete(Child child);



}

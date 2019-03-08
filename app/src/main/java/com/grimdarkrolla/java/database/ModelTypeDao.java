package com.grimdarkrolla.java.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.grimdarkrolla.java.models.ModelType;

import java.util.List;

@Dao
public interface ModelTypeDao {
    @Insert
    void insertModelType(ModelType modelType);

    @Query("SELECT * FROM modelType")
    List<ModelType> getAll();

    @Query("DELETE FROM modelType WHERE id = :id")
    public void deleteById(long id);

    @Query("DELETE FROM modelType")
    public void nukeTable();

    @Query("SELECT max(id) from modelType")
    public long getMaxIdFromDatabase();

    @Update
    public void updateModelType(ModelType modelType);
}

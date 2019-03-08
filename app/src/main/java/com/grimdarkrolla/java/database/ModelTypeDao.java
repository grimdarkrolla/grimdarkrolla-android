package com.grimdarkrolla.java.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.grimdarkrolla.java.models.ModelType;

import java.util.List;

@Dao
public interface ModelTypeDao {

    // Adds a new ModelType
    @Insert
    void insertModelType(ModelType modelType);

    // Gets all ModelTypes
    @Query("SELECT * FROM modelType")
    List<ModelType> getAll();

    // Deletes a specific ModelType
    @Query("DELETE FROM modelType WHERE id = :id")
    public void deleteById(long id);

    // Deletes all Modeltypes
    @Query("DELETE FROM modelType")
    public void nukeTable();

    // Gets the highest id number
    @Query("SELECT max(id) from modelType")
    public long getMaxIdFromDatabase();

    // Updates a specific ModelType
    @Update
    public void updateModelType(ModelType modelType);
}

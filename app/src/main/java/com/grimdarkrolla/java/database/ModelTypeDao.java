package com.grimdarkrolla.java.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.grimdarkrolla.java.models.ModelType;

import java.util.List;

@Dao
public interface ModelTypeDao {
    @Insert
    void insertModelType(ModelType modelType);

    @Query("SELECT * FROM modelType")
    List<ModelType> getAll();

    @Delete
    public void deleteModelType(ModelType modelType);

    @Query("DELETE FROM modelType")
    public void nukeTable();
}

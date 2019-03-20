package com.grimdarkrolla.java.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.grimdarkrolla.java.models.ModelType;

@Database(version = 2, entities = {ModelType.class}, exportSchema = false)
@TypeConverters({Converter.class})
public abstract class ModelTypeDatabase extends RoomDatabase {
    abstract public ModelTypeDao modelTypeDao();
}

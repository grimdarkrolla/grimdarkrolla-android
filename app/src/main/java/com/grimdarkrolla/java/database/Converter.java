package com.grimdarkrolla.java.database;

import android.arch.persistence.room.TypeConverter;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.grimdarkrolla.java.models.ModelType;

import java.lang.reflect.Type;

public class Converter {
    @TypeConverter
    public static ModelType stringToModelType(String data) {
        if (data == null) {
            return null;
        } else {
            Type defender = new TypeToken<ModelType>() {}.getType();
            return new Gson().fromJson(data, defender);
        }
    }

    @TypeConverter
    public static String ModelTypeToString(ModelType defender) {
        return new Gson().toJson(defender);
    }
}

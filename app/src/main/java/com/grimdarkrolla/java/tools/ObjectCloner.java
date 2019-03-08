package com.grimdarkrolla.java.tools;

import android.util.Log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectCloner {

    // Prevents anyone from accidentally creating an instance of ObjectCloner
    private ObjectCloner(){}

    // Returns a deep copy of an object
    static public Object deepCopy(Object ObjectToClone) throws Exception {
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

            // Serializes and passes the object
            objectOutputStream.writeObject(ObjectToClone);
            objectOutputStream.flush();

            ByteArrayInputStream bin = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(bin);

            // Returns the new object
            return objectInputStream.readObject();
        } catch(Exception e) {
            Log.i("Error", "Exception in ObjectCloner = " + e);
            throw(e);
        } finally {
            objectOutputStream.close();
            objectInputStream.close();
        }
    }
}

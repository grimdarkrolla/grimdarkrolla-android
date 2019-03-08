package com.grimdarkrolla.java.objectcloner;

import android.util.Log;

import com.grimdarkrolla.java.models.ModelType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectCloner {

    // so that nobody can accidentally create an ObjectCloner object
    private ObjectCloner(){}

    // returns a deep copy of an object
    static public Object deepCopy(Object oldObj) throws Exception {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            // Serializes and passes the object
            oos.writeObject(oldObj);
            oos.flush();

            ByteArrayInputStream bin =
                    new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bin);

            // Returns the new object
            return ois.readObject();
        } catch(Exception e) {
            System.out.println("Exception in ObjectCloner = " + e);
            throw(e);
        } finally {
            oos.close();
            ois.close();
        }
    }
}

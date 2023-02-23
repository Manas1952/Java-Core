package Class_object;

import java.io.*;
import java.lang.reflect.Constructor;

// different types of creating objects
// must override clone()
public class ClassObject implements Cloneable, Serializable {

    String name = "default name";

    // create and return copy of this object
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void print() {
        System.out.println(this);
    }
    public static void main(String[] args) {
        // 1. using new keyword
        ClassObject object1 = new ClassObject();

        // 2. using Class.newInstance() method
        try {
            ClassObject object2 = ClassObject.class.newInstance();

            object2.print();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }

        // 3. using newInstance() method of Constructor class
        try {
            Constructor<ClassObject> object3 = ClassObject.class.getConstructor();

            ClassObject object4 = object3.newInstance();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }

        // 4. using clone() method
        ClassObject object5 = new ClassObject();

        try {
            ClassObject object6 = (ClassObject) object5.clone();

            System.out.println(object6.name);

            System.out.println(object6 == object5);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }

        // 5. object serialization
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("outputStream");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(object1);

            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // 6. deserialization
        ClassObject object7 = null;

        try
        {
            FileInputStream fileInputStream = new FileInputStream("outputStream"); // reading an object from a file

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            object7 = (ClassObject) objectInputStream.readObject();        //deserialize object

            objectInputStream.close();

            fileInputStream.close();

            System.out.println("Object deserialized ");

            System.out.println("name = " + object7.name);
        }
        catch(IOException ioException)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}

package com.company.base;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	    //1. Input/Output Streams
        //2. Reader/Writer
        //3. ObjectInput/Output Stream Serialization


        //Serialization (class -> file) / Deserialization (file -> class)
        OutputStream outputStream = new FileOutputStream(new File("person.txt"));
        ObjectOutputStream oos  = new ObjectOutputStream(outputStream);

        Person david = new Person("David", 36);
        david.setType("Person");
        david.setPassword("123456");
        oos.writeObject(david);
        oos.flush();
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("person.txt")));
        Person getMyPersonBack = (Person) ois.readObject(); //Employee
        System.out.println(getMyPersonBack);
        ois.close();
    }
}



package com.company.base;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Shir", 44));
        people.add(new Person("Andrew", 51));
        people.add(new Person("Samuel", 31));
        people.add(new Person("Yosi", 34));
        people.add(new Person("Avi", 22));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("people.israel")))) {
            oos.writeObject(people);
            oos.flush();
        } catch (IOException e) {
            System.out.println("Everything is broken");
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("people.israel")))) {
            List<Person> personList = (List<Person>) ois.readObject();
            personList.forEach(x -> System.out.printf("Age: %s | Name: %s\n", x.getAge(), x.getName()));
        } catch (IOException e) {
            System.out.println("Everything is broken");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
        }

    }
}

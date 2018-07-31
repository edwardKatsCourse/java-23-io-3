package com.company.employees.reader;

import com.company.employees.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderMain {

    public static void main(String[] args) {
        System.out.println(readEmployee());
    }

    private static com.company.employees.model.Employee readEmployee() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("employee.e")))) {
            return (com.company.employees.model.Employee) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}

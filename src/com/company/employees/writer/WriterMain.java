package com.company.employees.writer;

import com.company.employees.Employee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class WriterMain {

    public static void main(String[] args) {
        Employee employee = new Employee(
                "Moshe",
                "Java Developer",
                "AT&T",
                LocalDate.now(),
                LocalDate.of(1990, 1, 1)
        );
        employee.setSalary(10000.00);

        write(employee);
    }

    private static void write(Employee employee) {
        //try (   ) {
        //
        //}
        employee.setCompany(null);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("employee.e")))) {
            oos.writeObject(employee);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

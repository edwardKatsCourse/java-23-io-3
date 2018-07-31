package com.company.base;

import java.io.Serializable;


/**
 class Person(name: String, age: Int) {
 }
 *
 */

public class Person implements Serializable {

    private String name;
    private Integer age;
    private static String type;
    private transient String password;

//private UserInfo -> CreditCardDetails

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public static void setType(String classType) {
        type = classType;
    }

    public static String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Age: %s | Type: %s | Password: %s",
                this.name,
                this.age,
                type,
                this.password);
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }
}
package com.company.employees.model;

import java.time.LocalDate;

public class Employee {
    private static final long serialVersionUID = 1;

    private String name;
    private String position;
    private String company;
    private LocalDate employmentStart;
    private LocalDate dateOfBirth;

    public Employee(String name,
                    String position,
                    String company,
                    LocalDate employmentStart,
                    LocalDate dateOfBirth) {
        this.name = name;
        this.position = position;
        this.company = company;
        this.employmentStart = employmentStart;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(LocalDate employmentStart) {
        this.employmentStart = employmentStart;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("name=%s, position=%s, company=%s, employmentStart=%s, dateOfBirth=%s",
                this.name,
                this.position,
                this.company,
                this.employmentStart,
                this.dateOfBirth
        );
    }
}

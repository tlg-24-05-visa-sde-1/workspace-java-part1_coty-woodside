/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 * <p>
 * Properties:
 * String name
 * String location
 * Employee[] employees  the Employees in this department.
 * int currentIndex      internal counter for number of employees in the department.
 * <p>
 * Methods (excluding get/set methods):
 * void listEmployees()  print info on all employees in the department.
 * void workEmployees()  make all employees in the department work.
 * String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();
    // constructors
    public Department() {
        super();
    }

    public Department(String name, String location) {
        super();
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        for (Employee emp : employees){
            System.out.println(emp);
        }
    }

    public void workEmployees() {
        for (Employee emp : employees){
            emp.work();
        }
    }

    public void payEmployees() {
        for (Employee emp : employees){
            emp.pay();
        }
    }

    public void holidayBreak(){
        for (Employee emp : employees) {

            if(emp instanceof SalariedEmployee){
              //  ((SalariedEmployee) employees[i]).takeVacation();
                SalariedEmployee semp = (SalariedEmployee) emp;
                semp.takeVacation();
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName() + ", location=" + getLocation();
    }
}
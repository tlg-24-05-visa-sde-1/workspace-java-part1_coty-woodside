/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1500.00));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 25.0, 25.0));
        dept.addEmployee(new SalariedEmployee("Craig", LocalDate.of(2000, 2, 2), 2500.00));
        dept.addEmployee(new HourlyEmployee("Bob", LocalDate.of(2000, 2, 2), 25.0, 25.0));

        dept.addEmployee( new Executive("Coty", LocalDate.of(1990, 8, 24), 1_500_000.00)) ;

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay employees
        System.out.println("\nPay employees");
        dept.payEmployees();

        // vacation
        System.out.println("\nHoliday break");
        dept.holidayBreak();
    }
}
package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;
    private double DEFAULT_STANDARD_DEDUCTION = 10_070.0;
    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    //business/action methods
    @Override
    public void pay() {
        System.out.println( getName() + " is paid salary " + getSalary());
    }

    public void takeVacation(){
        System.out.println( getName() + " is taking vacation");
    }

    public void payTaxes() {
        System.out.println(getName() + " paid taxes " + (SALARIED_TAX_RATE*getSalary()));
    }


    public double getStandardDeduction(){
        return DEFAULT_STANDARD_DEDUCTION;
    }

    //accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}
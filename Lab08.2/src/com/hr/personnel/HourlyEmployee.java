package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
    super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);

    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        this.rate = rate;
        this.hours = hours;

    }

    //busines/action methods
    @Override
    public void pay() {
        System.out.println( getName() + " is paid hourly " + (getRate() * getHours()));
    }


    //accesscors
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", rate=" + getRate() + ", hours=" + getHours();
    }
}
package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public static final double DEFAULT_STANDARD_DEDUCTION = 1_000_000.0;
    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " going golfing on the clock since " + getHireDate());
    }

    @Override
    public void fileReturn() {
        System.out.println("File returns via agent");
    }
    @Override
    public double getStandardDeduction(){
        return DEFAULT_STANDARD_DEDUCTION;
    }
}

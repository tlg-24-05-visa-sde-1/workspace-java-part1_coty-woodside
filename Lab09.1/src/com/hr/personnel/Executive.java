package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

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
}

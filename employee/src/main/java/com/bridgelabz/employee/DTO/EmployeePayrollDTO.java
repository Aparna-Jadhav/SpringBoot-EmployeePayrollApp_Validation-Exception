package com.bridgelabz.employee.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {
    // public int empId;

    @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name is InValid")
    public String name;
    @Min(value = 5000, message = "Minimum salary should be more than 5000")
    public long salary;
    @Pattern(regexp = "male|female", message = "Gender needs to be Male or Female")
    public String gender;

    /**
     *
     * @param name
     * @param salary
     */

    public EmployeePayrollDTO(String name, long salary) {
        // this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return (/* "empId=" + empId+ */ "name=" + name + ":salary=" + salary);
    }

}

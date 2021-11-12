package com.bridgelabz.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.employee.DTO.EmployeePayrollDTO;

@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {
    @Id
    public int empId;
    public String name;
    public long salary;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        this.empId = empId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

}

package com.bridgelabz.employee.service;

import java.util.List;

import com.bridgelabz.employee.DTO.EmployeePayrollDTO;
import com.bridgelabz.employee.model.EmployeePayrollData;

public interface IEmployeePayrollService 
{
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(int empId);

}

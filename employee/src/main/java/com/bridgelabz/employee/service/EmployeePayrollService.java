package com.bridgelabz.employee.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.employee.DTO.EmployeePayrollDTO;
import com.bridgelabz.employee.exception.EmployeePayrollException;
import com.bridgelabz.employee.model.EmployeePayrollData;
import com.bridgelabz.employee.repository.EmployeePayrollRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    EmployeePayrollRepository employeePayrollRepository;

    List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {

        // employeePayrollList.add(new EmployeePayrollData(1, new
        // EmployeePayrollDTO("Aparna", 500000)));
        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        // EmployeePayrollData employeePayrollData = null;
        // employeePayrollData = new EmployeePayrollData(empId, new
        // EmployeePayrollDTO("Anju", 450000));
        // return employeePayrollData;
        // return employeePayrollList.get(empId-1);

        return employeePayrollList.stream().filter(employeePayrollData -> employeePayrollData.getEmpId() == empId)
                .findFirst().orElseThrow(() -> new EmployeePayrollException("Employee not found"));
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        // employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        employeePayrollData = new EmployeePayrollData(employeePayrollList.size() + 1, employeePayrollDTO);
        employeePayrollList.add(employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
        employeePayrollData.setName(employeePayrollDTO.name);
        employeePayrollData.setSalary(employeePayrollDTO.salary);
        employeePayrollList.set(empId - 1, employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeePayrollList.remove(empId - 1);
    }

}

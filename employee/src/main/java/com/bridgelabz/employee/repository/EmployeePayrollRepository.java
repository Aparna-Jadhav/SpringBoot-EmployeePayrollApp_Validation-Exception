package com.bridgelabz.employee.repository;

import com.bridgelabz.employee.model.EmployeePayrollData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

}

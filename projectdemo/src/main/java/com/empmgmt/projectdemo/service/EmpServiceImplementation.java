package com.empmgmt.projectdemo.service;

import com.empmgmt.projectdemo.model.Employee;
import com.empmgmt.projectdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpServiceImplementation implements EmpService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

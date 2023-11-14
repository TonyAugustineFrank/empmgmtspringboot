package com.empmgmt.projectdemo.controller;

import com.empmgmt.projectdemo.model.Employee;
import com.empmgmt.projectdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmpService empService;

    @PostMapping("/add")
    public String add(@RequestBody Employee employee){
        empService.saveEmployee(employee);
        return "New Employee Added";
    }
}

package com.ayan.crudDemo.service;

import java.util.List;

import com.ayan.crudDemo.enitity.Employee;

public interface EmployeeService {
    
    List<Employee> findAll();
    
    Employee findById(int theId);

    Employee save(Employee theEmployee);
    
    void deleteById(int theId);
}

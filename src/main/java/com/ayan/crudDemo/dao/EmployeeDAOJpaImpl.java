package com.ayan.crudDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ayan.crudDemo.enitity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
    
    // define field for entitymanager 
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Employee> findAll() {
        // create a query 
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // execute query and get result list 
        List<Employee> employees = theQuery.getResultList();

        // return the results
        return employees;
    }


    @Override
    public Employee findById(int theId) {
        // // create a query 
        // TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee where id="+theId, Employee.class);

        // // Execute query and get result Employee
        // Employee employee = theQuery.getSingleResult();

        // // return the result;
        // return employee;

        Employee theEmployee = entityManager.find(Employee.class, theId);
        return theEmployee;
    }


    @Override
    public Employee save(Employee theEmployee) {
        // entityManager.persist(theEmployee);
        // return theEmployee;

        // save employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        // return the dbEmployee
        return dbEmployee;
    }


    @Override
    public void deleteById(int theId) {
        // find employee by id 
        Employee theEmployee = entityManager.find(Employee.class, theId);
        
        // remove employee
        entityManager.remove(theEmployee);
    }
}

package com.design.patterns.structural.facade;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public void addEmployee() {
        System.out.println("Add Employee");
    }

    @Override
    public void getEmployee() {
        System.out.println("Get Employee");
    }

    @Override
    public void getAllEmployee() {
        System.out.println("Get All Employee");
    }
}

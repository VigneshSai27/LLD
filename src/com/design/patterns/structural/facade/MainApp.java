package com.design.patterns.structural.facade;

// Hiding actual business logic client(bringing up facade layer between client and actual object)
// Note: Facade layer need not be an interface every time, it can be class as well(this class calls actual object).

public class MainApp {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServiceImpl();
        employeeService.addEmployee();
        employeeService.getEmployee();
        employeeService.getAllEmployee();
    }
}

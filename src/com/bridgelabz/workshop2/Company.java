package com.bridgelabz.workshop2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Company {

    Set<Employee> employees;

    public Company() {
        employees = new HashSet<>();
    }

    public void addEmployee(Scanner sc) {
        Employee employee = new Employee();

        System.out.println("Enter the name : ");
        employee.setName(sc.nextLine());

        System.out.println("Enter the age : ");
        employee.setAge(sc.nextLine());

        System.out.println("Enter the city : ");
        employee.setCity(sc.nextLine());

        System.out.println("Enter the State : ");
        employee.setState(sc.nextLine());

        System.out.println("Enter the department: ");
        employee.setDepartment(sc.nextLine());

        System.out.println("Enter the Phone Number ");
        employee.setPhoneNumber(sc.nextLine());

        employees.add(employee);
    }

    public void showContacts() {
        System.out.println("--------------------------------");
        if (employees.isEmpty()) {
            System.out.println("No records found");
        } else {
            employees.forEach(c -> {
                System.out.println("[Name="
                        + c.getName() + ", a   Age="
                        + c.getAge() + ", Phone Number="
                        + c.getPhoneNumber() + ", City=" + c.getCity()
                        + ", State=" + c.getState() + ", Department="
                        + c.getDepartment() + "]");
            });
        }
        System.out.println(
                "--------------------------------");
    }

}

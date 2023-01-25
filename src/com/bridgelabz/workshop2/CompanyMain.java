package com.bridgelabz.workshop2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyMain {
    static Scanner sc;
    public static void main(String[] args){
        System.out.println("--------------Welcome to Company and Employee List------------");
        sc = new Scanner(System.in);

        Map<String, Company> CompanyMap = new HashMap<>();

        Company company1 = new Company();
        Company company2 = new Company();
        Company company3 = new Company();

        CompanyMap.put("Company1", company1);
        CompanyMap.put("Company2", company2);
        CompanyMap.put("Company3", company3);

        int userOption = 0;
        while (userOption != 3) {
            userOption = getOptions(sc);
            String inputComapny = "";
            if (userOption != 2) {

                sc = new Scanner(System.in);
                System.out.println("Select the Company");
                System.out.println("Company1\nCompany2\nCompany3\nExit");
                inputComapny = sc.nextLine();
            }
            try {
                Company ab = CompanyMap.get(inputComapny);

                switch (userOption) {
                    case 1:
                        sc = new Scanner(System.in);
                        ab.addEmployee(sc);
                        break;

                    case 2:
                        CompanyMap.forEach((key, company) -> {
                                    System.out.println("------------" + key + "------------");
                                    company.showContacts();
                                });
                        break;


                    case 3:
                        userOption = 3;
                        System.out.println("---Good bye----");
                        break;

                    default:
                        System.out.println("Invalid selected option");
                }
            } catch (NullPointerException e) {
                System.out.println("Company is not found with " + inputComapny + " name.");
            }
        }
    }

    public static int getOptions(Scanner sc) {
        System.out.println("1. Add Employee \n2. Show Employees\n3. Exit");
        System.out.println("Select the valid option...");
        int option = sc.nextInt();
        return option;
    }


}

package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestDemo {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee(1,"aa");
        Employee employee1 = new Employee(1,"bb");
        list.add(employee);
        list.add(employee1);

        Set<Employee> employeeSet = new HashSet<>(list);

        System.out.println(employeeSet);
    }
}

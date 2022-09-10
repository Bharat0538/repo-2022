package com.example.demo;

import com.sun.source.doctree.SeeTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		List<Employee> list = new ArrayList<>();
		Employee employee = new Employee(1,"aa");
		Employee employee1 = new Employee(1,"bb");
		list.add(employee);
		list.add(employee1);
		Set<Employee> employeeSet = new HashSet<>(list);
		System.out.println(employeeSet);

	}

	

}

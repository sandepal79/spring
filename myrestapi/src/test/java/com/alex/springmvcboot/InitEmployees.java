package com.alex.springmvcboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class InitEmployees {

	List<Employee> empList = new ArrayList<>();

	Faker faker = new Faker();

	public InitEmployees() {

		for (int i = 0; i < 5; i++) {
			empList.add(new Employee(Long.parseLong(faker.code().isbn13(false)), faker.name().name(), faker.job().title(),
					(int) Math.round(Float.parseFloat(faker.commerce().price().replace(',', '.')) * 1000),
					new java.sql.Date(faker.date().birthday(25, 50).getTime())));
		}
	}

}

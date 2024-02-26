package com.hospital.db.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.sql.ast.tree.expression.Collation;

import ch.qos.logback.core.filter.Filter;

public class Example {
	record Person(String name, String pastDate) {

	}

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("satya", "2024-02-22 01:34:00"),
				new Person("sajid", "2024-02-22 01:36:00"), new Person("sai", "2024-02-22 01:39:00"),
				new Person("mohan", "2024-02-22 02:10:00"), new Person("krish", "2024-02-22 02:15:00"));

		String validTime = "2024-02-22 01:37:00";
		personList.stream().forEach(e -> getFormatedDate(e.name, e.pastDate(), validTime));
	}

	public static void getFormatedDate(String name, String pastDate, String validTime) {

		Date date1 = dateConvertion(pastDate);
		Date date2 = dateConvertion(validTime);

		if (date1.after(date2)) {
			System.out.println("--->" + name + " " + date1);
		}
	}

	public static Date dateConvertion(String convertDate) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(convertDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}

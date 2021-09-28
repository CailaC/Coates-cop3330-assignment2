/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caila Coates
 */
package ex39;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ex39Main {

    public static void main(String[] args)
    {
        Employee[] employees = {
                new Employee("John","Johnson","Manager",20161231),
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela", "Michaelson", "District Manager", 20151219),
                new Employee("Jake","Jacobson","Programmer",00000000),
                new Employee("Jackquelyn", "Jackson", "DBA",00000000),
                new Employee("Sally","Webber","Web Developer",20151218)
        };

// get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

// display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);


// Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

// Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

// sort employees by last name, then first name
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }
}



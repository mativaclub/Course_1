package ru.skypro;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private float salary;
    private int department;
    private final int id;
   private static int counter = 1;

    public Employee(String firstName, String lastName, String middleName, float salary, int department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "FirstName: " + firstName + ",  LastName: " + lastName + ",  MiddleName: "
                + middleName + ",  Salary: " + salary + ", Department: " + department + ", ID: " + id;
    }
    public static int getId() {
        return 0;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public float getSalary() {
        return salary;
    }
    public int getDepartment() {
        return department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.salary, salary) == 0 && department == employee.department && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, salary, department, id);
    }
}

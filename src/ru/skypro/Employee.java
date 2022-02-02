package ru.skypro;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private float salary;
    private int department;
    private int id;
   private static Integer counter = 1;

    public Employee(String firstName, String lastName, String middleName, float salary, int department, int id) {
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




}

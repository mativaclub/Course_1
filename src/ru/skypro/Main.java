package ru.skypro;

import java.util.Arrays;

public class Main {
    //1.1 Получить список всех сотрудников со всеми имеющимися по ним данными
    // Add employees
    public static boolean addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    //1.2 Получить список всех сотрудников со всеми имеющимися по ним данными
    // (вывести в консоль значения всех полей (toString)).
    public static void printAllEmployees(Employee[] employees) {
        System.out.println("List of All employees");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

//2. Посчитать сумму затрат на зарплаты в месяц.
    private static float calculateTotalSalary(Employee[] employees) {
        float sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum);
        return sum;
    }

    //3. Найти сотрудника с минимальной зарплатой.
    private static Employee minimumSalaryEmployee(Employee[] employees) {
        Employee result = employees[0];
        float min = employees[0].getSalary();
           int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                index = i;
            }
            }
        System.out.println("Сумма минимальной зарплаты в месяц составляет " + min +
                " и это сотрудник " + employees[index]);
        return employees[index];
    }

    //4. Найти сотрудника с максимальной зарплатой.
    private static Employee maximumSalary(Employee[] employees) {
        float max = employees[0].getSalary();
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                index = i;
            }
        }
        System.out.println("Сумма максимальной зарплаты в месяц составляет " + max +
                " и это сотрудник " + employees[index]);
        return employees[index];
    }

    //5. Подсчитать среднее значение зарплат.
    private static float printAverageSalaries(Employee[] employees) {
        float sum = 0;
        int employeesQty = 0;
        for (int i=0; i < employees.length; i ++){
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
}
        for (int i=0; i < employees.length; i ++){
            if (employees[i] != null) {
                employeesQty = i + 1;
            }
        }
        float average = sum / employeesQty;
        System.out.println("Средняя сумма затрат на зарплаты в месяц составляет " + average);
        return sum;
    }

    //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
    private static void printEmployeeName(Employee[] employeeNames) {
        System.out.println("Ф. И. О. всех сотрудников ");
        for (Employee employeeName : employeeNames) {
            if (employeeName != null) {
                System.out.println("Ф. И. О. сотрудникa " + employeeName.getFirstName() + " " +
                        employeeName.getLastName() + " " + employeeName.getMiddleName());
            } else if (employeeName == null) {
                System.out.println("EMPTY");
            }
        }
    }


    //7.Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников
    // на величину аргумента в %).

    //8.Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
    //8.1. Сотрудника с минимальной зарплатой.
    //8.2. Сотрудника с максимальной зарплатой.
    //8.3. Сумму затрат на зарплату по отделу.
    //8.4. Среднюю зарплату по отделу (учесть, что количество людей в
    // отделе отличается от employees.length).
    //8.5. Проиндексировать зарплату всех сотрудников отдела на процент,
    // который приходит в качестве параметра.
    //9. Напечатать всех сотрудников отдела (все данные, кроме отдела).
    //Получить в качестве параметра число и найти:
    //9.1. Всех сотрудников с зарплатой меньше числа
    // (вывести id, Ф. И. О. и зарплатой в консоль).
    //9.2. Всех сотрудников с зарплатой больше (или равно)
    // числа (вывести id, Ф. И. О. и зарплатой в консоль).

    //С помощью **шести** методов можно вывести данные:
    //
    //- сотрудник с минимальной зарплатой,
    //- сотрудник с максимальной зарплатой,
    //- сумма затрат на зарплату по отделу,
    //- средняя зарплата по отделу,
    //- индексация зарплаты на %,
    //- печать всех данных всех сотрудников одного отдела, кроме номера отдела.



    public static void printEmployees(Employee[] employees) {
        System.out.println("List of All employees");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
            System.out.println(employees[i].toString());
        }else if (employees[i] == null) {
                System.out.println("EMPTY");
            }
    }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        addEmployee(employees, new Employee("Ivan", "Ivanov", "Ivanovich", 100000, 1));
        addEmployee(employees, new Employee("Pavel", "Pavlov", "Pavlovich", 20000, 2));
        addEmployee(employees, new Employee("Oleg", "Ivanov", "Olegovich", 30000, 3));
        addEmployee(employees, new Employee("Ruslan", "Ruslanov", "Ruslanovich", 40000, 4));
        addEmployee(employees, new Employee("Denis", "Denisov", "Denisovich", 50000, 5));
        addEmployee(employees, new Employee("Karina", "Markovna", "Olegovna", 60000, 1));
        addEmployee(employees, new Employee("Kristina", "Mikhalkova", "Ivanovna", 70000, 2));
        addEmployee(employees, new Employee("Anna", "Petrova", "Pavlovna", 80000, 3));
        addEmployee(employees, new Employee("Marina", "Ivanova", "Ruslanovna", 90000, 4));
        addEmployee(employees, new Employee("Diana", "Pavlova", "Denisovna", 250000, 5));

       //1. Получить список всех сотрудников со всеми имеющимися по ним данными (toString)
        printAllEmployees(employees);
        System.out.println();

        //2. Посчитать сумму затрат на зарплаты в месяц.
        calculateTotalSalary(employees);
        System.out.println();

        //3. Найти сотрудника с минимальной зарплатой.
        minimumSalaryEmployee(employees);
        System.out.println();

        //4. Найти сотрудника с максимальной зарплатой.
        maximumSalary(employees);
        System.out.println();

        //5. Подсчитать среднее значение зарплат.
        printAverageSalaries(employees);
        System.out.println();

        //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
        printEmployeeName(employees);


   }
}


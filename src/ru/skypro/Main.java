package ru.skypro;

public class Main {

    public static boolean addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }
    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("List of All employees: " + employees[i].toString());
        }
        }

    public static void printEmployeesName(String firstName, String lastName, String middleName) {
            System.out.println("List of All employees: ");
        }

    private static void printEmployeesName() {
        System.out.println(Employee.getFirstName);
    }


    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        addEmployee(employees, new Employee("Ivan", "Ivanov", "Ivanovich", 10000, 1, Employee.getId()));
        addEmployee(employees, new Employee("Pavel", "Pavlov", "Pavlovich", 20000, 2, Employee.getId()));
        addEmployee(employees, new Employee("Oleg", "Ivanov", "Olegovich", 30000, 3, Employee.getId()));
        addEmployee(employees, new Employee("Ruslan", "Ruslanov", "Ruslanovich", 40000, 4, Employee.getId()));
        addEmployee(employees, new Employee("Denis", "Denisov", "Denisovich", 50000, 5, Employee.getId()));
        addEmployee(employees, new Employee("Karina", "Markovna", "Olegovna", 60000, 1, Employee.getId()));
        addEmployee(employees, new Employee("Kristina", "Mikhalkova", "Ivanovna", 70000, 2, Employee.getId()));
        addEmployee(employees, new Employee("Anna", "Petrova", "Pavlovna", 80000, 3, Employee.getId()));
        addEmployee(employees, new Employee("Marina", "Ivanova", "Ruslanovna", 90000, 4, Employee.getId()));
        addEmployee(employees, new Employee("Diana", "Pavlova", "Denisovna", 100000, 5, Employee.getId()));

        printAllEmployees(employees);
        printEmployeesName()

        //    6. По умолчанию все поля должны передавать через конструктор (кроме id)
        //    и заполняться в нем (включая id, который нужно получить из счетчика).

        //        2. Посчитать сумму затрат на зарплаты в месяц.
        //        3. Найти сотрудника с минимальной зарплатой.
        //        4. Найти сотрудника с максимальной зарплатой.
        //        5. Подсчитать среднее значение зарплат (можно использовать для этого метод
        //        из пункта b).
        //        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).







//Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
//Написать статические методы для работы с массивом в классе, где располагается метод main:
//Добавить книгу (найти свободную ячейку массива и положить туда книгу). Учесть, что этот метод может быть вызван любое количество раз (от 1 до 5) и каждая новая книга должна успешно укладываться в массив.
//         b.   Напечатать в консоль все книги из массива в следующем формате: “Stephen King: The Stand: 1978”
//Критерии оценки
//В методе main создан массив и заполнен созданными ранее объектами.
//Методы объявлены корректно.
//Методы корректно справляются со своей задачей.

//Сложный уровень
//Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
//Учесть, что доступ к нему должен быть только из Library (private поле), а сеттеры и геттеры отсутствуют. Работать с массивом можно только через внутренние нестатические методы класса Library.
//2. Конструктор класса должен получать в качестве параметра размер массива и инициализировать в себе поле массива тем размером, что пришел параметром.
//3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
//4. Создать новые нестатические методы в классе Library:
//Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
//       Формат: “The Stand by Stephen King was published in 1978”
//Изменить год публикации книги по ее названию.
//       В метод подаются два параметра, а именно: название и новый год публикации. Нужно найти книгу и изменить ее год публикации.
//Критерии оценки
//Класс Library создан корректно.
//Массив корректно перенесен в виде поля в класс Library.
//Конструктор класса Library написан корректно.
//Корректно перенесены методы, модификатор static удален.
//Объявлены новые методы.
//Методы корректно справляются со своей задачей.









   }


}


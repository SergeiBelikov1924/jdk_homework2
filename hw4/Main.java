package hw.hw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anna", "+47542580001", 125117, 6);
        Employee emp2 = new Employee("Waldemar", "+47542580002", 125614, 3);
        Employee emp3 = new Employee("Sigfrid", "+47542580003", 124258, 4);
        Employee emp4 = new Employee("Helga", "+47542580004", 124569, 2);
        Employee emp5 = new Employee("Klaus", "+47542580005", 125654, 3);
        Employee emp6 = new Employee("Wolfgan", "+47542580006", 124951, 1);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        EmployeeBook eBook = new EmployeeBook(employees);

        System.out.println(eBook.findEmployeeByExperience(eBook.getEmployeeList(), 6));
        System.out.println(eBook.findPhoneByName(eBook.getEmployeeList(),"Sigfrid"));
        System.out.println(eBook.findByUin(eBook.getEmployeeList(), 125117));
        System.out.println(eBook.findByUin(eBook.getEmployeeList(), 32));
        eBook.addEmployeeToList(eBook.getEmployeeList(), emp6);
        System.out.println(eBook.getEmployeeList());
    }
}
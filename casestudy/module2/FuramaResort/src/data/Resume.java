package data;

import models.Employee;

import java.util.Stack;

import static Controllers.MainController.listEmployee;

public class Resume {
    public static Stack<Employee> getAllEmployee() {
        Stack<Employee> employeeList = new Stack<>();
        for (Employee employee : listEmployee) {
            employeeList.push(employee);
        }
        return employeeList;
    }
}

package Controllers;

import data.Resume;
import models.Employee;

import java.util.*;

import static Controllers.MainController.displayMainMenu;
import static Controllers.MainController.listEmployee;


public class EmployeeController {
    static Map<Integer, Object> map = new HashMap<>();

    public static void showInformationEmployees() {
        int id = 1;
        for (Employee employee : listEmployee) {
            map.put(id++, employee);
        }
        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            Employee employee = (Employee) entry.getValue();
            System.out.println(entry.getKey() + " " + employee.showInfor());
            System.out.println("------------------------------------------------");
        }
        displayMainMenu();
    }

    public static void findEmployeeFromResume() {
        Scanner scanner = new Scanner(System.in);
        Stack<Employee> stack = Resume.getAllEmployee();
        System.out.print("Nhap ten Employee can tim: ");
        String enterName = scanner.next();
        System.out.println("Found employee below:");
        try {
            while (true) {
                boolean flag = stack.peek().getFullName().contains(enterName);
                if (!flag) {
                    stack.pop();
                } else {
                    System.out.println("------------------------------------------------");
                    System.out.println(stack.pop().showInfor());
                }
            }
        } catch (Exception e) {
            displayMainMenu();
        }
    }
}

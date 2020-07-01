package Controllers;

import Commons.FuncFileEmployee;
import Commons.FuncFileService;
import Commons.FuncFileCustomer;
import models.*;

import java.util.ArrayList;
import java.util.Scanner;

import static Controllers.BookingController.addNewBooking;
import static Controllers.BookingController.bookingMovieTicket4D;
import static Controllers.CustomerController.addNewCustomer;
import static Controllers.CustomerController.showInformationCustomer;
import static Controllers.EmployeeController.findEmployeeFromResume;
import static Controllers.EmployeeController.showInformationEmployees;
import static Controllers.ServiceController.addNewServices;
import static Controllers.ServiceController.showServices;

public class MainController {
    public static ArrayList<Services> listServices = new ArrayList<>();
    public static ArrayList<Customer> listCustomer = new ArrayList<>();
    public static ArrayList<Employee> listEmployee = new ArrayList<>();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        //doc file
        listServices = FuncFileService.getfileCSVToListService();
        listCustomer = FuncFileCustomer.getFileCSVToListCustomer();
        listEmployee = FuncFileEmployee.getFileCSVToListEmployee();
        System.out.println("------------------------------------------------");
        System.out.println("Main Menu");
        System.out.println("1. Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Booking Movie Ticket 4D\n" +
                "8.Find Employee\n" +
                "9.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInformationEmployees();
                break;
            case "7":
                bookingMovieTicket4D();
                break;
            case "8":
                findEmployeeFromResume();
                break;
            case "9":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                displayMainMenu();
        }
    }
}

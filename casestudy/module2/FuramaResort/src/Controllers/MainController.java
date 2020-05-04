package Controllers;

import Commons.FuncFileCSV;
import Commons.FuncFileCustomer;
import models.*;

import java.util.ArrayList;
import java.util.Scanner;

import static Controllers.BookingController.addNewBooking;
import static Controllers.CustomerController.addNewCustomer;
import static Controllers.CustomerController.showInformationCustomer;
import static Controllers.EmployeeController.showInformationEmployees;
import static Controllers.ServiceController.addNewServices;
import static Controllers.ServiceController.showServices;

public class MainController {
    public static ArrayList<Services> listServices = new ArrayList<>();
    public static ArrayList<Customer> listCustomer = new ArrayList<>();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        //doc file
        listServices = FuncFileCSV.getfileCSVToListService();
        listCustomer = FuncFileCustomer.getFileCSVToListCustomer();
        System.out.println("------------------------------------------------");
        System.out.println("Main Menu");
        System.out.println("1. Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Exit");
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
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                displayMainMenu();
        }
    }
}

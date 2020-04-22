package Controllers;

import models.Room;
import models.Services;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("1. Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewServices();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                displayMainMenu();
        }
    }

    public static void addNewServices() {
//        Services[] services=new Services[10];

        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        System.out.print("Enter choose: ");
        switch (choose) {
            case 1:
            case 2:
            case 3:
            case 4:
                addNewServices();break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                addNewServices();
        }
    }
}

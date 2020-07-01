package Controllers;

import Commons.FuncFileBooking;
import models.Customer;
import models.Services;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static Controllers.MainController.*;
import static Controllers.ServiceController.*;

public class BookingController {
    static Queue<String> bookMovie = new LinkedList<>();

    public static void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        System.out.println("List Customer");
        for (Customer customer : listCustomer) {
            System.out.println("Id: " + id + "\tName: " + customer.getFullName() + "\tCMND: " + customer.getCMND());
            id++;
        }
        System.out.print("Choose the Customer: ");
        int chooseCustomer = scanner.nextInt();
        boolean flag = true;
        while (flag) {
            System.out.println("List Service");
            System.out.println("1.Booking Villa\n" +
                    "2.Booking House\n" +
                    "3.Booking Room\n");
            System.out.print("Choose the Service: ");
            int chooseBooking = scanner.nextInt();
            switch (chooseBooking) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                default:
                    System.out.println("does not exit! Please Choose again:");
            }
            System.out.println();
            System.out.print("Choose id Service Booking: ");
            String booking = scanner.next();
            for (Services services : listServices) {
                if (booking.equals(services.getId())) {
                    System.out.print("Id already exists: ");
                    booking = scanner.next();
                } else {
                    flag = false;
                    listCustomer.get(chooseCustomer - 1).setUseService(services);
                    break;
                }
            }
        }
        FuncFileBooking.writeBookingFileCSV(listCustomer);
        System.out.println("Booking OK and return the Menu");
        displayMainMenu();
    }

    public static void bookingMovieTicket4D() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add new Customer" +
                "\n2.Show All Customer Booking Movie" +
                "\n3.Back to menu");
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
                System.out.print("Enter Name Customer: ");
                String name = scanner.next();
                bookMovie.add(name);
                break;
            case "2":
                System.out.println("Danh sach customer booking Movie4D");
                while (bookMovie.peek() != null) {
                    System.out.println(bookMovie.poll());
                }
            case "3":
                displayMainMenu();
            default:
                bookingMovieTicket4D();
        }
        bookingMovieTicket4D();
    }
}

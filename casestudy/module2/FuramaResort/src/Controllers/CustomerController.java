package Controllers;

import Commons.FuncFileCustomer;
import models.Customer;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static Commons.CustomerException.*;
import static Controllers.MainController.*;

public class CustomerController {
    public static void addNewCustomer() {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Full Name: ");
                customer.setFullName(scanner.nextLine());
                nameException(customer.getFullName());
                break;
            } catch (Exception e) {
                System.out.println("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
            }
        }
        while (true) {
            try {
                System.out.print("Enter birthday: ");
                customer.setBirthday(scanner.next());
                birthdayException(customer.getBirthday());
                break;
            } catch (Exception e) {
                System.out.println("Birthday có định dạng DD/MM/YYYY");
            }
        }
        while (true) {
            try {
                System.out.print("Enter Gender: ");
                customer.setGender(scanner.next());
                genderException(customer.getGender());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập vào Male, Female hoặc Unknow");
            }
        }
        while (true) {
            try {
                System.out.print("Enter CMND: ");
                customer.setCMND(scanner.next());
                idCardException(customer.getCMND());
                break;
            } catch (Exception e) {
                System.out.println("Id Card phải có 9 chữ số và theo định dạng XXX-XXX-XXX hoặc đã tồn tại");
            }
        }
        while (true) {
            try {
                System.out.print("Enter Number Phone: ");
                customer.setNumberPhone(scanner.next());
                numberPhoneException(customer.getNumberPhone());
                break;
            } catch (Exception e) {
                System.out.println("Number Phone có 10 số!");
            }
        }
        while (true) {
            try {
                System.out.print("Enter Email: ");
                customer.setEmail(scanner.next());
                emailException(customer.getEmail());
                break;
            } catch (Exception e) {
                System.out.println("Email không hợp lệ!");
            }
        }
        System.out.print("Enter Type Customer:");
        customer.setTypeCustomer(scanner.next());
        System.out.print("Enter Address: ");
        customer.setAddress(scanner.next());
        listCustomer.add(customer);
        FuncFileCustomer.writeCustomerFileCSV(listCustomer);
        displayMainMenu();
    }

    public static void showInformationCustomer() {
        //sap xep A-Z
        Collections.sort(listCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer Customer1, Customer Customer2) {
                return Customer1.getFullName().compareTo(Customer2.getFullName());
            }
        });
        for (Customer customer : listCustomer) {
            System.out.println("------------------------------------------------");
            System.out.println(customer.showInfor());
        }
        displayMainMenu();
    }
}

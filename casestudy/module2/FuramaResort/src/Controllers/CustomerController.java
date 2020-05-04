package Controllers;

import Commons.FuncFileCustomer;
import models.Customer;
import models.Services;
import models.Villa;

import java.util.Scanner;

import static Controllers.MainController.listCustomer;
import static Controllers.MainController.listServices;

public class CustomerController {
    public static void addNewCustomer() {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        customer.setFullName(scanner.nextLine());
        System.out.print("Enter birthday: ");
        customer.setBirthday(scanner.next());
        System.out.print("Enter Gender: ");
        customer.setGender(scanner.next());
        System.out.print("Enter CMND: ");
        customer.setCMND(scanner.next());
        System.out.print("Enter Number Phone: ");
        customer.setNumberPhone(scanner.next());
        System.out.print("Enter Type Customer:");
        customer.setTypeCustomer(scanner.next());
        System.out.print("Enter Address: ");
        customer.setAddress(scanner.next());

        System.out.print("Enter ID Service: ");
        String chooseID = scanner.next();
        for (Services services : listServices) {
            if (chooseID.equals(services.getId())) {
                customer.setUseService(/*(Villa)*/services);
            }
        }
        FuncFileCustomer.writeCustomerFileCSV(listCustomer);
    }

    public static void showInformationCustomer() {

    }
}

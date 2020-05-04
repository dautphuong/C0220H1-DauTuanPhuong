package Commons;

import models.Customer;

import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCustomer {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileCustomer = "src/data/Customer.csv";
    //header file CSV Customer
    private static final String FILE_HEADER_CUSTOMER = "fullName,birthday,gender,CMND,numberPhone,typeCustomer,address,useService";

    public static void writeCustomerFileCSV(ArrayList<Customer> listCustomer) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileCustomer);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            for (Customer customer : listCustomer) {
                fileWriter.append(NEW_LINE_SEPARATOR);
                fileWriter.append(customer.getFullName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getCMND());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getNumberPhone());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(customer.getUseService().getId());
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter Customer!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }
}

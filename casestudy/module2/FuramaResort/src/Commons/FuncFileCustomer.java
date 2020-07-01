package Commons;

import models.Customer;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class FuncFileCustomer {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileCustomer = "src/data/Customer.csv";
    //header file CSV Customer
    private static final String FILE_HEADER_CUSTOMER = "fullName,birthday,gender,CMND,numberPhone,email,typeCustomer,address";

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
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
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

    public static ArrayList<Customer> getFileCSVToListCustomer() {
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<>();
        //doc file Customer.csv
        //tạo file nếu chưa tồn tại
        Path pathCustomer = Paths.get(fileCustomer);
        if (!Files.exists(pathCustomer)) {
            try {
                Writer writer = new FileWriter(fileCustomer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileCustomer));
            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("fullName")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setFullName(splitdata[0]);
                customer.setBirthday(splitdata[1]);
                customer.setGender(splitdata[2]);
                customer.setCMND(splitdata[3]);
                customer.setNumberPhone(splitdata[4]);
                customer.setEmail(splitdata[5]);
                customer.setTypeCustomer(splitdata[6]);
                customer.setAddress(splitdata[7]);
                listCustomer.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listCustomer;
    }
}

package Commons;

import models.Customer;

import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileBooking {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileBooking = "src/data/Booking.csv";
    //header file CSV Customer
    private static final String FILE_HEADER_BOOKING = "fullName,CMND,idService";

    public static void writeBookingFileCSV(ArrayList<Customer> listCustomer) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileBooking);
            fileWriter.append(FILE_HEADER_BOOKING);
            for (Customer customer : listCustomer) {
                if (customer.getUseService() != null) {
                    fileWriter.append(NEW_LINE_SEPARATOR);
                    fileWriter.append(customer.getFullName());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(customer.getCMND());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(customer.getUseService().getId());
                }
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter Booking!");
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

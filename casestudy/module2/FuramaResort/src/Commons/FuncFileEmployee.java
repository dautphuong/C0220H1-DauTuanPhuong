package Commons;


import models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileEmployee {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileEmployee = "src/data/Employee.csv";
    private static final String FILE_HEADER_EMPLOYEE = "fullname,age,address";

    public static ArrayList<Employee> getFileCSVToListEmployee() {
        BufferedReader br = null;
        ArrayList<Employee> listEmployee = new ArrayList<>();
        //doc file Employee.csv
        //tạo file nếu chưa tồn tại
        Path pathEmployee = Paths.get(fileEmployee);
        if (!Files.exists(pathEmployee)) {
            try {
                Writer writer = new FileWriter(fileEmployee);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileEmployee));
            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("fullName")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setFullName(splitdata[0]);
                employee.setAge(splitdata[1]);
                employee.setAddress(splitdata[2]);
                listEmployee.add(employee);
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
        return listEmployee;
    }
}

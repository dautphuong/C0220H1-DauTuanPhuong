package read_write_file;

import java.io.*;

public class ReadWriteFileTest {

    public static void main(String[] args) {
        try {
//            BufferedWriter bufferedWriter = new BufferedWriter(
//                    new FileWriter("H:/test.abc"));
//            bufferedWriter.write("abc");
//            bufferedWriter.newLine();
//            bufferedWriter.write("xyz");
//            // Phải close mới ghi được dữ liệu
//            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("H:/test.abc"));
//            System.out.println(bufferedReader.readLine());

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineElement = line.split(",");
                System.out.println(lineElement[0]);
                System.out.println(lineElement[1]);
                System.out.println(lineElement[2]);
                System.out.println(lineElement[3]);

//                HocVien hocVien = new HocVien(Integer.parseInt(lineElement[0]), lineElement[1])
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

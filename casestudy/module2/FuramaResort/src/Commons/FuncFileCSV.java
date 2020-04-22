package Commons;

import javafx.concurrent.Service;
import models.Services;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPARATOR="\n";
    private static final String fileVilla="src/data/Villa.csv";
    private static final String fileHouse="src/data/House.csv";
    private static final String fileRoom="src/data/Room.csv";
    //header file CSV Villa
    private static final String FILE_HEADER_VILLA="id,typeService,area,cost,numberOfAccompanying,typeRoom,criteria,descriptionOfAmenities,areaPool,numFloor";
    //header file CSV House
    private static final String FILE_HEADER_HOUSE="id,typeService,area,cost,numberOfAccompanying,typeRoom,criteria,descriptionOfAmenities,numFloor";
    //header file CSV Room
    private static final String FILE_HEADER_ROOM="id,typeService,area,cost,numberOfAccompanying,typeRoom,accompaniedService,unit,costAccompanied";

    //ghi file Villa.csv
    public static void writeVillaFileCSV(ArrayList<Villa> listVilla){
        FileWriter fileWriter=null;
        try{
            fileWriter=new FileWriter(fileVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Villa villa:listVilla){
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfAccompanying()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getCriteria());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getDescriptionOfAmenities());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaPool()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumFloor()));
            }

        }catch (Exception e){
            System.out.println("Error in CsvFileWriter !");
        }finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception e){
                System.out.println("Error when flush or close");
            }
        }
    }
    //doc file Villa.csv
//    public static ArrayList<Villa> readVillaFileCSV(){
//        BufferedReader br=null;
//    }
}

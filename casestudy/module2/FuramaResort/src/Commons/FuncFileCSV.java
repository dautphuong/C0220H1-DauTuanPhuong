package Commons;

import javafx.concurrent.Service;
import models.Services;
import models.Villa;

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


    public static void writeServiceFileCSV(ArrayList<Services> listService){
        FileWriter fileWriter=null;
        try{
            for (Services services : listService){
                if(services instanceof Villa){
                    fileWriter=new FileWriter(fileVilla);
                    fileWriter.append(FILE_HEADER_VILLA);
                    fileWriter.append(NEW_LINE_SEPARATOR);
                    for(Services services1:listService){
                        fileWriter.append(services1.getId());
                        fileWriter.append(services1.getTypeService());
                        fileWriter.append((char) services1.getArea());
                        fileWriter.append((char) services1.getCost());
                        fileWriter.append((char) services1.getNumberOfAccompanying());
                        fileWriter.append(services1.getTypeRoom());
                        fileWriter.append(services1.getId());
                        fileWriter.append(services1.getId());
                        fileWriter.append(services1.getId());
                        fileWriter.append(services1.getId());
                    }
                }
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
}

package Commons;

import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class FuncFileService {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileVilla = "src/data/Villa.csv";
    private static final String fileHouse = "src/data/House.csv";
    private static final String fileRoom = "src/data/Room.csv";
    //header file CSV Villa
    private static final String FILE_HEADER_VILLA = "id,typeService,area,cost,numberOfAccompanying,typeRoom,criteria,descriptionOfAmenities,areaPool,numFloor";
    //header file CSV House
    private static final String FILE_HEADER_HOUSE = "id,typeService,area,cost,numberOfAccompanying,typeRoom,criteria,descriptionOfAmenities,numFloor";
    //header file CSV Room
    private static final String FILE_HEADER_ROOM = "id,typeService,area,cost,numberOfAccompanying,typeRoom,accompaniedService,unit,costAccompanied";

    //ghi file Villa.csv
    public static void writeVillaFileCSV(ArrayList<Services> listVilla) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            for (Services villa : listVilla) {
                if (villa instanceof Villa) {
                    fileWriter.append(NEW_LINE_SEPARATOR);
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
                    fileWriter.append(((Villa) villa).getCriteria());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(((Villa) villa).getDescriptionOfAmenities());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(((Villa) villa).getAreaPool()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(((Villa) villa).getNumFloor()));
                }
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter Villa!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    //ghi file House.csv
    public static void writeHouseFileCSV(ArrayList<Services> listHouse) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileHouse);
            fileWriter.append(FILE_HEADER_HOUSE);
            for (Services house : listHouse) {
                if (house instanceof House) {
                    fileWriter.append(NEW_LINE_SEPARATOR);
                    fileWriter.append(house.getId());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(house.getTypeService());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getArea()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getCost()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getNumberOfAccompanying()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(house.getTypeRoom());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(((House) house).getCriteria());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(((House) house).getDescriptionOfAmenities());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(((House) house).getNumFloor()));
                }
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter House !");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    //ghi file Room.csv
    public static void writeRoomFileCSV(ArrayList<Services> listRoom) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileRoom);
            fileWriter.append(FILE_HEADER_ROOM);
            for (Services room : listRoom) {
                if (room instanceof Room) {
                    fileWriter.append(NEW_LINE_SEPARATOR);
                    fileWriter.append(room.getId());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(room.getTypeService());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getArea()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getCost()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getNumberOfAccompanying()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(room.getTypeRoom());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(((Room) room).getAccompaniedService());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(((Room) room).getUnit()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(((Room) room).getCostAccompanied()));
                }
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter Room !");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }

    //doc tat ca file vao mang
    public static ArrayList<Services> getfileCSVToListService() {
        BufferedReader br = null;
        ArrayList<Services> listServices = new ArrayList<>();
        //doc file Villa.csv
        //tạo file nếu chưa tồn tại
        Path pathVilla = Paths.get(fileVilla);
        if (!Files.exists(pathVilla)) {
            try {
                Writer writer = new FileWriter(fileVilla);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileVilla));
            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("id")) {
                    continue;
                }
                Services villa = new Villa();
                villa.setId(splitdata[0]);
                villa.setTypeService(splitdata[1]);
                villa.setArea(Double.parseDouble(splitdata[2]));
                villa.setCost(Double.parseDouble(splitdata[3]));
                villa.setNumberOfAccompanying(Integer.parseInt(splitdata[4]));
                villa.setTypeRoom(splitdata[5]);
                ((Villa) villa).setCriteria(splitdata[6]);
                ((Villa) villa).setDescriptionOfAmenities(splitdata[7]);
                ((Villa) villa).setAreaPool(Double.parseDouble(splitdata[8]));
                ((Villa) villa).setNumFloor(Integer.parseInt(splitdata[9]));
                listServices.add(villa);
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

        //doc file House.csv
        //tạo file nếu chưa tồn tại
        Path pathHouse = Paths.get(fileHouse);
        if (!Files.exists(pathHouse)) {
            try {
                Writer writer = new FileWriter(fileHouse);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileHouse));
            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("id")) {
                    continue;
                }
                Services house = new House();
                house.setId(splitdata[0]);
                house.setTypeService(splitdata[1]);
                house.setArea(Double.parseDouble(splitdata[2]));
                house.setCost(Double.parseDouble(splitdata[3]));
                house.setNumberOfAccompanying(Integer.parseInt(splitdata[4]));
                house.setTypeRoom(splitdata[5]);
                ((House) house).setCriteria(splitdata[6]);
                ((House) house).setDescriptionOfAmenities(splitdata[7]);
                ((House) house).setNumFloor(Integer.parseInt(splitdata[8]));
                listServices.add(house);
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

        //doc file Room.csv
        //tạo file nếu chưa tồn tại
        Path pathRoom = Paths.get(fileRoom);
        if (!Files.exists(pathRoom)) {
            try {
                Writer writer = new FileWriter(fileRoom);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileRoom));
            while ((line = br.readLine()) != null) {
                String[] splitdata = line.split(",");
                if (splitdata[0].equals("id")) {
                    continue;
                }
                Services room = new Room();
                room.setId(splitdata[0]);
                room.setTypeService(splitdata[1]);
                room.setArea(Double.parseDouble(splitdata[2]));
                room.setCost(Double.parseDouble(splitdata[3]));
                room.setNumberOfAccompanying(Integer.parseInt(splitdata[4]));
                room.setTypeRoom(splitdata[5]);
                ((Room) room).setAccompaniedService(splitdata[6]);
                ((Room) room).setUnit(Integer.parseInt(splitdata[7]));
                ((Room) room).setCostAccompanied(Double.parseDouble(splitdata[8]));
                listServices.add(room);
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
        return listServices;
    }

}

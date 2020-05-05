package Controllers;

import Commons.FuncFileService;
import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

import static Controllers.MainController.*;

class ServiceController {

    //case1 displayMainMenu
    static void addNewServices() {

        System.out.println("------------------------------------------------");
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
                addNewVilla(scanner);
                break;
            case "2":
                addNewHouse(scanner);
                break;
            case "3":
                addNewRoom(scanner);
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                addNewServices();
        }

    }

    private static void addNewRoom(Scanner scanner) {
        System.out.println("------------------------------------------------");
        System.out.println("New Service Room: ");
        Services room = new Room();
        //input and check ok Id
        System.out.print("Enter Id: ");
        room.setId(scanner.next());
        //id không trùng nhau
        for (Services services : listServices) {
            while (!Pattern.matches("SVRO-[0-9]{4}", room.getId())) {
                System.out.print("Please enter Id again: ");
                room.setId(scanner.next());
            }
            if (room.getId().equals(services.getId())) {
                System.out.print("Id already exists: ");
                room.setId(scanner.next());
            } else {
                break;
            }
        }
        //input typeService and check ok
        System.out.println("Enter Type Service: ");
        room.setTypeService(scanner.next());
        while (!Pattern.matches("^[A-Z][a-zA-Z0-9]+", room.getTypeService())) {
            System.out.print("Please enter Type Service again: ");
            room.setTypeService(scanner.next());
        }
        //input and check ok Area
        System.out.print("Enter Area: ");
        while (true) {
            try {
                room.setArea(Double.parseDouble(scanner.next())); //fix trôi code khi nextDouble
                if (room.getArea() >= 30) {
                    break;
                } else {
                    System.out.print("Please enter Area again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Area again: ");
            }
        }
        //input and check ok Cost
        System.out.print("Enter Cost: ");
        while (true) {
            try {
                room.setCost(Double.parseDouble(scanner.next()));
                ; //fix trôi code khi nextDouble
                if (room.getCost() >= 0) {
                    break;
                } else {
                    System.out.print("Please enter Cost again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Cost again: ");
            }
        }
        //input and check ok Number Of Accompanying
        System.out.print("Enter Number Of Accompanying: ");
        while (true) {
            try {
                room.setNumberOfAccompanying(Integer.parseInt(scanner.next()));
                ;
                ; //fix trôi code khi nextInt
                if (room.getNumberOfAccompanying() >= 0 && room.getNumberOfAccompanying() <= 20) {
                    break;
                } else {
                    System.out.print("Please enter Number Of Accompanying again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Number Of Accompanying again: ");
            }
        }
        //input and check ok Type Room
        System.out.print("Enter Type Room: ");
        room.setTypeRoom(scanner.next());
        while (!Pattern.matches("^[A-Z][a-zA-Z0-9]+", room.getTypeRoom())) {
            System.out.print("Please enter Type Room again: ");
            room.setTypeRoom(scanner.next());
        }
        //input and check ok Accompanied Service
        System.out.print("Enter Accompanied Service: ");
        ((Room) room).setAccompaniedService(scanner.next());
        while (!Pattern.matches("massage|karaoke|food|drink|car", ((Room) room).getAccompaniedService())) {
            System.out.print("Please enter Accompanied Service again: ");
            ((Room) room).setAccompaniedService(scanner.next());
        }
        //input and check ok Unit
        System.out.print("Enter Unit: ");
        while (true) {
            try {
                ((Room) room).setUnit(Integer.parseInt(scanner.next())); //fix trôi code khi nextInt
                if (((Room) room).getUnit() >= 0) {
                    break;
                } else {
                    System.out.print("Please enter Unit again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Unit again: ");
            }
        }
        //input and check ok Cost Accompanied
        System.out.print("Enter Cost Accompanied: ");
        while (true) {
            try {
                ((Room) room).setCostAccompanied(Double.parseDouble(scanner.next())); //fix trôi code khi nextInt
                if (((Room) room).getCostAccompanied() >= 0) {
                    break;
                } else {
                    System.out.print("Please enter Cost Accompanied again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Cost Accompanied again: ");
            }
        }
        //add arrayList
        listServices.add(room);
        FuncFileService.writeRoomFileCSV(listServices);
        addNewServices();
    }

    private static void addNewHouse(Scanner scanner) {
        {
            System.out.println("------------------------------------------------");
            System.out.println("New Service House: ");
            Services house = new House();
            //input and check ok Id
            System.out.print("Enter Id: ");
            house.setId(scanner.next());
            //id không trùng nhau
            for (Services services : listServices) {
                while (!Pattern.matches("SVHO-[0-9]{4}", house.getId())) {
                    System.out.print("Please enter Id again: ");
                    house.setId(scanner.next());
                }
                if (house.getId().equals(services.getId())) {
                    System.out.print("Id already exists: ");
                    house.setId(scanner.next());
                } else {
                    break;
                }
            }
            //input typeService and check ok
            System.out.println("Enter Type Service: ");
            house.setTypeService(scanner.next());
            while (!Pattern.matches("^[A-Z][a-zA-Z0-9]+", house.getTypeService())) {
                System.out.print("Please enter Type Service again: ");
                house.setTypeService(scanner.next());
            }
            //input and check ok Area
            System.out.print("Enter Area: ");
            while (true) {
                try {
                    house.setArea(Double.parseDouble(scanner.next())); //fix trôi code khi nextDouble
                    if (house.getArea() >= 30) {
                        break;
                    } else {
                        System.out.print("Please enter Area again: ");
                    }
                } catch (Exception e) {
                    System.out.print("Please enter Area again: ");
                }
            }
            //input and check ok Cost
            System.out.print("Enter Cost: ");
            while (true) {
                try {
                    house.setCost(Double.parseDouble(scanner.next()));
                    ; //fix trôi code khi nextDouble
                    if (house.getCost() >= 0) {
                        break;
                    } else {
                        System.out.print("Please enter Cost again: ");
                    }
                } catch (Exception e) {
                    System.out.print("Please enter Cost again: ");
                }
            }
            //input and check ok Number Of Accompanying
            System.out.print("Enter Number Of Accompanying: ");
            while (true) {
                try {
                    house.setNumberOfAccompanying(Integer.parseInt(scanner.next()));
                    ;
                    ; //fix trôi code khi nextInt
                    if (house.getNumberOfAccompanying() >= 0 && house.getNumberOfAccompanying() <= 20) {
                        break;
                    } else {
                        System.out.print("Please enter Number Of Accompanying again: ");
                    }
                } catch (Exception e) {
                    System.out.print("Please enter Number Of Accompanying again: ");
                }
            }
            //input and check ok Type Room
            System.out.print("Enter Type Room: ");
            house.setTypeRoom(scanner.next());
            while (!Pattern.matches("^[A-Z][a-zA-Z0-9]+", house.getTypeRoom())) {
                System.out.print("Please enter Type Room again: ");
                house.setTypeRoom(scanner.next());
            }
            //input Criteria
            System.out.print("Enter Criteria: ");
            ((House) house).setCriteria(scanner.next());
            //input Description Of Amenities
            System.out.print("Enter Description Of Amenities: ");
            ((House) house).setDescriptionOfAmenities(scanner.next());
            //input and check ok Num Floor
            System.out.print("Enter Num Floor: ");
            while (true) {
                try {
                    ((House) house).setNumFloor(Integer.parseInt(scanner.next())); //fix trôi code khi nextInt
                    if (((House) house).getNumFloor() >= 0 && ((House) house).getNumFloor() <= 10) {
                        break;
                    } else {
                        System.out.print("Please enter Area Pool again: ");
                    }
                } catch (Exception e) {
                    System.out.print("Please enter Area Pool again: ");
                }
            }
            //add arrayList
            listServices.add(house);
            FuncFileService.writeHouseFileCSV(listServices);
            addNewServices();
        }
    }

    private static void addNewVilla(Scanner scanner) {
        System.out.println("------------------------------------------------");
        System.out.println("New Service Villa: ");
        Services villa = new Villa();
        //input and check ok Id
        System.out.print("Enter Id: ");
        villa.setId(scanner.next());
        //id không trùng nhau
        for (Services services : listServices) {
            while (!Pattern.matches("SVVL-[0-9]{4}", villa.getId())) {
                System.out.print("Please enter Id again: ");
                villa.setId(scanner.next());
            }
            if (villa.getId().equals(services.getId())) {
                System.out.print("Id already exists: ");
                villa.setId(scanner.next());
            } else {
                break;
            }
        }
        //input typeService and check ok
        System.out.println("Enter Type Service: ");
        villa.setTypeService(scanner.next());
        while (!Pattern.matches("^[A-Z][a-zA-Z0-9]+", villa.getTypeService())) {
            System.out.print("Please enter Type Service again: ");
            villa.setTypeService(scanner.next());
        }
        //input and check ok Area
        System.out.print("Enter Area: ");
        while (true) {
            try {
                villa.setArea(Double.parseDouble(scanner.next())); //fix trôi code khi nextDouble
                if (villa.getArea() >= 30) {
                    break;
                } else {
                    System.out.print("Please enter Area again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Area again: ");
            }
        }
        //input and check ok Cost
        System.out.print("Enter Cost: ");
        while (true) {
            try {
                villa.setCost(Double.parseDouble(scanner.next()));
                ; //fix trôi code khi nextDouble
                if (villa.getCost() >= 0) {
                    break;
                } else {
                    System.out.print("Please enter Cost again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Cost again: ");
            }
        }
        //input and check ok Number Of Accompanying
        System.out.print("Enter Number Of Accompanying: ");
        while (true) {
            try {
                villa.setNumberOfAccompanying(Integer.parseInt(scanner.next()));
                ;
                ; //fix trôi code khi nextInt
                if (villa.getNumberOfAccompanying() >= 0 && villa.getNumberOfAccompanying() <= 20) {
                    break;
                } else {
                    System.out.print("Please enter Number Of Accompanying again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Number Of Accompanying again: ");
            }
        }
        //input and check ok Type Room
        System.out.print("Enter Type Room: ");
        villa.setTypeRoom(scanner.next());
        while (!Pattern.matches("^[A-Z][a-zA-Z0-9]+", villa.getTypeRoom())) {
            System.out.print("Please enter Type Room again: ");
            villa.setTypeRoom(scanner.next());
        }
        //input Criteria
        System.out.print("Enter Criteria: ");
        ((Villa) villa).setCriteria(scanner.next());
        //input Description Of Amenities
        System.out.print("Enter Description Of Amenities: ");
        ((Villa) villa).setDescriptionOfAmenities(scanner.next());
        //input and check ok Area Pool
        System.out.print("Enter Area Pool: ");
        while (true) {
            try {
                ((Villa) villa).setAreaPool(Double.parseDouble(scanner.next())); //fix trôi code khi nextDouble
                if (((Villa) villa).getAreaPool() >= 0) {
                    break;
                } else {
                    System.out.print("Please enter Area Pool again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Area Pool again: ");
            }
        }
        //input and check ok Num Floor
        System.out.print("Enter Num Floor: ");
        while (true) {
            try {
                ((Villa) villa).setNumFloor(Integer.parseInt(scanner.next())); //fix trôi code khi nextInt
                if (((Villa) villa).getNumFloor() >= 0 && ((Villa) villa).getNumFloor() <= 10) {
                    break;
                } else {
                    System.out.print("Please enter Area Pool again: ");
                }
            } catch (Exception e) {
                System.out.print("Please enter Area Pool again: ");
            }
        }
        //add arrayList
        listServices.add(villa);
        FuncFileService.writeVillaFileCSV(listServices);
        addNewServices();
    }


    //case2 displayMainMenu
    static void showServices() {
        System.out.println("------------------------------------------------");
        System.out.println("1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Room Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
                showAllVilla();
                break;
            case "2": {
                showAllHouse();
            }
            break;
            case "3":
                showAllRoom();
                break;
            case "4":
                showAllNameNotDuplicate("Villa");
                break;
            case "5":
                showAllNameNotDuplicate("House");
                break;
            case "6":
                showAllNameNotDuplicate("Room");
                break;
            case "7":
                displayMainMenu();
                break;
            case "8":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                showServices();
        }
        showServices();
    }

    private static void showAllNameNotDuplicate(String service) {
        TreeSet<String> treeSet = new TreeSet<>(new HashSet<>());
        switch (service) {
            case "Villa":
                for (Services services : listServices) {
                    if (services instanceof Villa) {
                        treeSet.add(services.getTypeService());
                    }
                }
                break;
            case "House":
                for (Services services : listServices) {
                    if (services instanceof House) {
                        treeSet.add(services.getTypeService());
                    }
                }
                break;
            case "Room":
                for (Services services : listServices) {
                    if (services instanceof Room) {
                        treeSet.add(services.getTypeService());
                    }
                }
                break;
        }
        System.out.println("List Name Service Not Duplicate");
        for (String services : treeSet) {
            System.out.println(services);
        }
    }

    static void showAllRoom() {
        for (Services room : listServices) {
            if (room instanceof Room) {
                System.out.println("------------------------------------------------");
                System.out.println(room.showInfor());
            }
        }
    }

    static void showAllHouse() {
        for (Services house : listServices) {
            if (house instanceof House) {
                System.out.println("------------------------------------------------");
                System.out.println(house.showInfor());
            }
        }
    }

    static void showAllVilla() {
        for (Services villa : listServices) {
            if (villa instanceof Villa) {
                System.out.println("------------------------------------------------");
                System.out.println(villa.showInfor());
            }
        }
    }
}

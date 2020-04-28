package Controllers;

import Commons.FuncFileCSV;
import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    static ArrayList<Services>listServices=new ArrayList<>();
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("1. Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                displayMainMenu();
        }
    }

    private static void addNewServices() {
        //doc file
        listServices=FuncFileCSV.getfileVillaToListService();

        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":{
                System.out.println("New Service Villa: ");
                Services villa=new Villa();
                System.out.print("Enter Id: ");
                villa.setId(scanner.next());
                villa.setTypeService("Villa");
                System.out.print("Enter Area: ");
                villa.setArea(scanner.nextDouble());
                System.out.print("Enter Cost: ");
                villa.setCost(scanner.nextDouble());
                System.out.print("Enter Number Of Accompanying: ");
                villa.setNumberOfAccompanying(scanner.nextInt());
                System.out.print("Enter Type Room: ");
                villa.setTypeRoom(scanner.next());
                System.out.print("Enter Criteria: ");
                ((Villa) villa).setCriteria(scanner.next());
                System.out.print("Enter Description Of Amenities: ");
                ((Villa) villa).setDescriptionOfAmenities(scanner.next());
                System.out.print("Enter Area Pool: ");
                ((Villa) villa).setAreaPool(scanner.nextInt());
                System.out.print("Enter Num Floor: ");
                ((Villa) villa).setNumFloor(scanner.nextInt());
                listServices.add(villa);
                FuncFileCSV.writeVillaFileCSV(listServices);
                addNewServices();
            }break;
            case "2":{
                System.out.println("New Service House: ");
                Services house=new House();
                System.out.print("Enter Id: ");
                house.setId(scanner.next());
                house.setTypeService("House");
                System.out.print("Enter Area: ");
                house.setArea(scanner.nextDouble());
                System.out.print("Enter Cost: ");
                house.setCost(scanner.nextDouble());
                System.out.print("Enter Number Of Accompanying: ");
                house.setNumberOfAccompanying(scanner.nextInt());
                System.out.print("Enter Type Room: ");
                house.setTypeRoom(scanner.next());
                System.out.print("Enter Criteria: ");
                ((House) house).setCriteria(scanner.next());
                System.out.print("Enter Description Of Amenities: ");
                ((House) house).setDescriptionOfAmenities(scanner.next());
                System.out.print("Enter Num Floor: ");
                ((House) house).setNumFloor(scanner.nextInt());
                listServices.add(house);
                FuncFileCSV.writeHouseFileCSV(listServices);
                addNewServices();
            }break;
            case "3":{
                System.out.println("New Service Room: ");
                Services room=new Room();
                System.out.print("Enter Id: ");
                room.setId(scanner.next());
                room.setTypeService("House");
                System.out.print("Enter Area: ");
                room.setArea(scanner.nextDouble());
                System.out.print("Enter Cost: ");
                room.setCost(scanner.nextDouble());
                System.out.print("Enter Number Of Accompanying: ");
                room.setNumberOfAccompanying(scanner.nextInt());
                System.out.print("Enter Type Room: ");
                room.setTypeRoom(scanner.next());
                System.out.print("Enter Accompanied Service: ");
                ((Room) room).setAccompaniedService(scanner.next());
                System.out.print("Enter Unit: ");
                ((Room) room).setUnit(scanner.nextInt());
                System.out.print("Enter Cost Accompanied: ");
                ((Room) room).setCostAccompanied(scanner.nextDouble());
                listServices.add(room);
                FuncFileCSV.writeRoomFileCSV(listServices);
                addNewServices();
            }break;
            case "4":
                displayMainMenu();break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                addNewServices();
        }

    }

    private static void showServices() {
        listServices=FuncFileCSV.getfileVillaToListService();
        System.out.println("1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Name Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose){
            case "1":{
                for(Services villa:listServices){
                    if(villa instanceof Villa) {
                        System.out.println("Id: "+villa.getId());
                        System.out.println("Type Service:"+ villa.getTypeService());
                        System.out.println("Area: "+villa.getArea());
                        System.out.println("Cost: "+villa.getCost());
                        System.out.println("Number Of Accompanying: "+villa.getNumberOfAccompanying());
                        System.out.println("Type Room: "+villa.getTypeRoom());
                        System.out.println("Criteria: "+((Villa) villa).getCriteria());
                        System.out.println("Description Of Amenities: "+((Villa) villa).getDescriptionOfAmenities());
                        System.out.println("Area Pool: "+((Villa) villa).getAreaPool());
                        System.out.println("Num Floor: "+((Villa) villa).getNumFloor());
                        System.out.println("------------------------------------------------");
                    }
                }
            }break;
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
                displayMainMenu();break;
            case "8":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                showServices();
        }
    }

}

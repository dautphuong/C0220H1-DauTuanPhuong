package Controllers;

import Commons.FuncFileCSV;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {

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
        ArrayList<Villa>listVilla=new ArrayList<Villa>();
        ArrayList<House>listHouse=new ArrayList<House>();
        ArrayList<Room>listRoom=new ArrayList<Room>();
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
                Villa villa=new Villa();
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
                villa.setCriteria(scanner.next());
                System.out.print("Enter Description Of Amenities: ");
                villa.setDescriptionOfAmenities(scanner.next());
                System.out.print("Enter Area Pool: ");
                villa.setAreaPool(scanner.nextInt());
                System.out.print("Enter Num Floor: ");
                villa.setNumFloor(scanner.nextInt());
                listVilla.add(villa);
                FuncFileCSV.writeVillaFileCSV(listVilla);
                addNewServices();
            }break;
            case "2":{
                System.out.println("New Service House: ");
                House house=new House();
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
                house.setCriteria(scanner.next());
                System.out.print("Enter Description Of Amenities: ");
                house.setDescriptionOfAmenities(scanner.next());
                System.out.print("Enter Num Floor: ");
                house.setNumFloor(scanner.nextInt());
                listHouse.add(house);
                FuncFileCSV.writeHouseFileCSV(listHouse);
                addNewServices();
            }break;
            case "3":{
                System.out.println("New Service Room: ");
                Room room=new Room();
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
                room.setAccompaniedService(scanner.next());
                System.out.print("Enter Unit: ");
                room.setUnit(scanner.nextInt());
                System.out.print("Enter Cost Accompanied: ");
                room.setCostAccompanied(scanner.nextDouble());
                listRoom.add(room);
                FuncFileCSV.writeRoomFileCSV(listRoom);
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

    }
}

package Controllers;

import Commons.FuncFileCSV;
import Commons.FuncFileCustomer;
import models.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainController {
    static ArrayList<Services> listServices = new ArrayList<>();
    static ArrayList<Customer> listCustomer =new ArrayList<>();
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("------------------------------------------------");
        System.out.println("Main Menu");
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
                addNewCustomer();
            case "4":
                //Task 5
            case "5":
                //Task 7
            case "6":
                //Task 9
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                displayMainMenu();
        }
    }
    //case3 displayMainMenu
    private static void addNewCustomer() {
        Customer customer=new Customer();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        customer.setFullName(scanner.nextLine());
        System.out.print("Enter birthday: ");
        customer.setBirthday(scanner.next());
        System.out.print("Enter Gender: ");
        customer.setGender(scanner.next());
        System.out.print("Enter CMND: ");
        customer.setCMND(scanner.next());
        System.out.print("Enter Number Phone: ");
        customer.setNumberPhone(scanner.next());
        System.out.print("Enter Type Customer:");
        customer.setTypeCustomer(scanner.next());
        System.out.print("Enter Address: ");
        customer.setAddress(scanner.next());
        System.out.print("Enter ID Service: ");
        String chooseID=scanner.next();
        for(Services services:listServices){
            if(chooseID.equals(services.getId())){
                customer.setUseService(services);
            }
        }

        FuncFileCustomer.writeCustomerFileCSV(listCustomer);
    }

    //case1 displayMainMenu
    private static void addNewServices() {
        //doc file
        listServices = FuncFileCSV.getfileCSVToListService();
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
            case "1": {
                System.out.println("------------------------------------------------");
                System.out.println("New Service Villa: ");
                Services villa = new Villa();
                //input and check ok Id
                System.out.print("Enter Id: ");
                villa.setId(scanner.next());
                //id không trùng nhau
                for(Services services:listServices) {
                    while (!Pattern.matches("SVVL-[0-9]{4}", villa.getId())) {
                        System.out.print("Please enter Id again: ");
                        villa.setId(scanner.next());
                    }
                    if(villa.getId().equals(services.getId())){
                        System.out.print("Id already exists: ");
                        villa.setId(scanner.next());
                    }else{
                        break;
                    }
                }
                //input typeService
                villa.setTypeService("Villa");
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
                FuncFileCSV.writeVillaFileCSV(listServices);
                addNewServices();
            }
            break;
            case "2": {
                System.out.println("------------------------------------------------");
                System.out.println("New Service House: ");
                Services house = new House();
                //input and check ok Id
                System.out.print("Enter Id: ");
                house.setId(scanner.next());
                //id không trùng nhau
                for(Services services:listServices) {
                    while (!Pattern.matches("SVHO-[0-9]{4}", house.getId())) {
                        System.out.print("Please enter Id again: ");
                        house.setId(scanner.next());
                    }
                    if(house.getId().equals(services.getId())){
                        System.out.print("Id already exists: ");
                        house.setId(scanner.next());
                    }else{
                        break;
                    }
                }
                //input typeService
                house.setTypeService("Villa");
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
                FuncFileCSV.writeHouseFileCSV(listServices);
                addNewServices();
            }
            break;
            case "3": {
                System.out.println("------------------------------------------------");
                System.out.println("New Service Room: ");
                Services room = new Room();
                //input and check ok Id
                System.out.print("Enter Id: ");
                room.setId(scanner.next());
                //id không trùng nhau
                for(Services services:listServices) {
                    while (!Pattern.matches("SVRO-[0-9]{4}", room.getId())) {
                        System.out.print("Please enter Id again: ");
                        room.setId(scanner.next());
                    }
                    if(room.getId().equals(services.getId())){
                        System.out.print("Id already exists: ");
                        room.setId(scanner.next());
                    }else{
                        break;
                    }
                }
                //input typeService
                room.setTypeService("Villa");
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
                FuncFileCSV.writeRoomFileCSV(listServices);
                addNewServices();
            }
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


    //case2 displayMainMenu
    private static void showServices() {
        listServices = FuncFileCSV.getfileCSVToListService();
        System.out.println("------------------------------------------------");
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
        switch (choose) {
            case "1": {
                for (Services villa : listServices) {
                    if (villa instanceof Villa) {
                        System.out.println("------------------------------------------------");
                        System.out.println(villa.showInfor());
                    }
                }
            }
            break;
            case "2": {
                for (Services house : listServices) {
                    if (house instanceof House) {
                        System.out.println("------------------------------------------------");
                        System.out.println(house.showInfor());
                    }
                }
            }
            break;
            case "3": {
                for (Services room : listServices) {
                    if (room instanceof Room) {
                        System.out.println("------------------------------------------------");
                        System.out.println(room.showInfor());
                    }
                }
            }
            break;
            case "4":
                //Task 8
            case "5":
                //Task 8
            case "6":
                //Task 8
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
}

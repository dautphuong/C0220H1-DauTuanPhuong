package Commons;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import models.Customer;

import java.io.IOException;
import java.nio.file.Path;
import java.sql.Date;
import java.util.regex.Pattern;

import static Controllers.MainController.listCustomer;

public class CustomerException {

    public static void nameException(String nameCustomer) throws Exception {
        if (!Pattern.matches("(^[A-Z]([a-z]?)+)(\\s[A-Z]([a-z]?)+)?+", nameCustomer)) {
            throw new IOException();
        }
    }

    public static void emailException(String emailCustomer) throws Exception {
        if (!Pattern.matches("^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-])+.)+[.]([a-zA-Z0-9]{2,4})+$", emailCustomer)) {
            throw new IOException();
        }
    }

    public static void genderException(String genderCustomer) throws Exception {
        if (!Pattern.matches("Male|Female|Unknow", genderCustomer)) {
            throw new IOException();
        }
    }

    public static void idCardException(String cmndCustomer) throws Exception {
        //cmnd không trùng nhau
        for (Customer customer : listCustomer) {
            if (cmndCustomer.equals(customer.getCMND())) {
                throw new IOException();
            } else {
                break;
            }
        }
        if (!Pattern.matches("[0-9]{3}-[0-9]{3}-[0-9]{3}", cmndCustomer)) {
            throw new IOException();
        }
    }

    public static void birthdayException(String birthdayCustomer) throws Exception {
        if (!Pattern.matches("^[\\d]{2}\\/[\\d]{2}\\/[\\d]{4}$", birthdayCustomer)) {
            throw new IOException();
        }
        //giờ hệ thống
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        String mydate = String.valueOf(date);
        //data,month,year
        String[] splitDate = mydate.split("-");
        String[] splitData = birthdayCustomer.split("/");
        if (Integer.parseInt(splitData[2]) <= (Integer.parseInt(splitDate[0]) - 18) && Integer.parseInt(splitData[2]) >= 1900) {
            switch (Integer.parseInt(splitData[1])) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (Integer.parseInt(splitData[0]) < 0 || Integer.parseInt(splitData[0]) > 31) {
                        throw new IOException();
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (Integer.parseInt(splitData[0]) < 0 || Integer.parseInt(splitData[0]) > 30) {
                        throw new IOException();
                    }
                    break;
                case 2:
                    if (Integer.parseInt(splitData[2]) % 4 == 0) {
                        if (Integer.parseInt(splitData[2]) % 100 == 0) {
                            if (Integer.parseInt(splitData[2]) % 400 == 0) {
                                if (Integer.parseInt(splitData[0]) > 29 || Integer.parseInt(splitData[0]) < 0) {
                                    throw new IOException();
                                }
                            } else {
                                if (Integer.parseInt(splitData[0]) > 28 || Integer.parseInt(splitData[0]) < 0) {
                                    throw new IOException();
                                }
                            }
                        } else {
                            if (Integer.parseInt(splitData[0]) > 29 || Integer.parseInt(splitData[0]) < 0) {
                                throw new IOException();
                            }
                        }
                    } else {
                        if (Integer.parseInt(splitData[0]) > 28 || Integer.parseInt(splitData[0]) < 0) {
                            throw new IOException();
                        }
                    }
                    break;
                default:
                    throw new IOException();
            }
        } else {
            throw new IOException();
        }
    }

    public static void numberPhoneException(String numberPhoneCustomer) throws Exception {
        if (!Pattern.matches("[0-9]{10}", numberPhoneCustomer)) {
            throw new IOException();
        }
    }
}

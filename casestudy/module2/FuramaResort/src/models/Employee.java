package models;

public class Employee {
    private String fullName;//họ tên nhân viên
    private String age;//tuổi
    private String address;//địa chỉ


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String showInfor() {
        return "Full Name: " + getFullName() +
                "\nAge: " + getAge() +
                "\nAddress: " + getAddress();
    }
}

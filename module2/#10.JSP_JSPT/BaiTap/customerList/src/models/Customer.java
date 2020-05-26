package models;

public class Customer {
    private String fullname;
    private String birthday;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(String fullname, String birthday, String address, String image) {
        this.fullname=fullname;
        this.birthday=birthday;
        this.address=address;
        this.image=image;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

package models;

public class Customer {
    private String fullName;//họ tên customer
    private String birthday;//ngày sinh
    private String gender;//giới tính
    private String CMND;
    private String numberPhone;//số điện thoại
    private String email;
    private String typeCustomer;//loại khách
    private String address;//địa chỉ
    private Services useService;//thuộc tính sử dụng dịch vụ

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUseService() {
        return useService;
    }

    public void setUseService(Services useService) {
        this.useService = useService;
    }

    public String showInfor() {
        return "Full Name: " + getFullName() +
                "\nBirthday: " + getBirthday() +
                "\nGender: " + getGender() +
                "\nCMND: " + getCMND() +
                "\nNumber Phone: " + getNumberPhone() +
                "\nType Customer: " + getTypeCustomer() +
                "\nAddress: " + getAddress();
    }
}

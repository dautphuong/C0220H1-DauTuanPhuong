package models;

public class House extends Services {
    private String criteria;//Tiêu chuẩn phòng
    private String descriptionOfAmenities;//Mô tả tiện nghi khác
    private int numFloor;//Số tầng

    public House() {
    }

    public House(String id, String typeService, double area, double cost, int numberOfAccompanying, String typeRoom, String criteria, String descriptionOfAmenities, int numFloor) {
        super(id, typeService, area, cost, numberOfAccompanying, typeRoom);
        this.criteria = criteria;
        this.descriptionOfAmenities = descriptionOfAmenities;
        this.numFloor = numFloor;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getDescriptionOfAmenities() {
        return descriptionOfAmenities;
    }

    public void setDescriptionOfAmenities(String descriptionOfAmenities) {
        this.descriptionOfAmenities = descriptionOfAmenities;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    @Override
    public String showInfor() {
        return super.toString() +
                "\nCriteria: " + getCriteria() +
                "\nDescription Of Amenities: " + getDescriptionOfAmenities() +
                "\nNumber Floor: " + getNumFloor();
    }
}

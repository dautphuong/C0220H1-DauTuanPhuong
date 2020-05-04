package models;

public class Villa extends Services {
    private String criteria;//Tiêu chuẩn phòng
    private String descriptionOfAmenities;//Mô tả tiện nghi khác
    private double areaPool;//Pool area
    private int numFloor;//Số tầng

    public Villa() {
    }

    public Villa(String id, String typeService, double area, double cost, int numberOfAccompanying, String typeRoom, String criteria, String descriptionOfAmenities, double areaPool, int numFloor) {
        super(id, typeService, area, cost, numberOfAccompanying, typeRoom);
        this.criteria = criteria;
        this.descriptionOfAmenities = descriptionOfAmenities;
        this.areaPool = areaPool;
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
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
                "\nArea Pool: " + getAreaPool() +
                "\nNumber Floor: " + getNumFloor();
    }
}

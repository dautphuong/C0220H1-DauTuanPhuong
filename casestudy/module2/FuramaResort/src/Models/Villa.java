package Models;

public class Villa extends Services {
    public String criteria;//Tiêu chuẩn phòng
    public String descriptionOfAmenities;//Mô tả tiện nghi khác
    public double areaPool;//Pool area
    public int numFloor;//Số tầng

    public Villa() {
    }

    public Villa(String id, double area, double cost, int numberOfAccompanying, String typeRoom, String criteria, String descriptionOfAmenities, double areaPool, int numFloor) {
        super(id, "Villa", area, cost, numberOfAccompanying, typeRoom);
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

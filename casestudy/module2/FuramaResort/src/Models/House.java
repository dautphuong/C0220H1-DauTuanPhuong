package Models;

public class House extends Services {
    public String criteria;//Tiêu chuẩn phòng
    public String descriptionOfAmenities;//Mô tả tiện nghi khác
    public int numFloor;//Số tầng

    public House() {
    }

    public House(String id, double area, double cost, int numberOfAccompanying, String typeRoom, String criteria, String descriptionOfAmenities, int numFloor) {
        super(id, "House", area, cost, numberOfAccompanying, typeRoom);
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

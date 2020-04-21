package models;

public abstract class Services {
    public String id;
    public String typeService;//Tên dịch vụ.
    public double area;//Diện tích sử dụng.
    public double cost;//Chi phí thuê.
    public int numberOfAccompanying;//Số lượng người tối đa.
    public String typeRoom;//Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).

    public Services() {
    }

    public Services(String id, String typeService, double area, double cost, int numberOfAccompanying, String typeRoom) {
        this.id = id;
        this.typeService = typeService;
        this.area = area;
        this.cost = cost;
        this.numberOfAccompanying = numberOfAccompanying;
        this.typeRoom = typeRoom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberOfAccompanying() {
        return numberOfAccompanying;
    }

    public void setNumberOfAccompanying(int numberOfAccompanying) {
        this.numberOfAccompanying = numberOfAccompanying;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public abstract String showInfor();

    @Override
    public String toString() {
        return "id : " + getId() +
                "\nType Service: " + getTypeService() +
                "\nArea: " + getArea() +
                "\nCost: " + getCost() +
                "\nNumber Of Accompanying: " + getNumberOfAccompanying() +
                "\ntypeRoom: " + getTypeRoom();
    }
}

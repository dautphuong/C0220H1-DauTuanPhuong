package models;

public class Room extends Services {
    private String accompaniedService;//Tên dịch vụ đi kèm
    private int unit;//Đơn vị
    private double costAccompanied;//Giá tiền

    public Room() {
    }

    public Room(String id, String typeService, double area, double cost, int numberOfAccompanying, String typeRoom, String accompaniedService, int unit, double costAccompanied) {
        super(id, typeService, area, cost, numberOfAccompanying, typeRoom);
        this.accompaniedService = accompaniedService;
        this.unit = unit;
        this.costAccompanied = costAccompanied;
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getCostAccompanied() {
        return costAccompanied;
    }

    public void setCostAccompanied(double costAccompanied) {
        this.costAccompanied = costAccompanied;
    }

    @Override
    public String showInfor() {
        return super.toString() +
                "\nAccompanied Service: " + getAccompaniedService() +
                "\nUnit: " + getUnit() +
                "\ncostAccompanied: " + getCostAccompanied();
    }
}

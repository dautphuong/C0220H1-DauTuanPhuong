package Models;

public class RunTask1 {
    public static void main(String[] args) {
        Services[] services=new Services[3];
        services[0]=new Villa("01",58,500,3,"year","A","ok",24,5);
        services[1]=new House("02",36,300,2,"month","B","ok",2);
        services[2]=new Room("01",58,100,1,"date","massage",1,20);
        System.out.println(services[0].showInfor());
        System.out.println("---------------");
        System.out.println(services[1].showInfor());
        System.out.println("---------------");
        System.out.println(services[2].showInfor());
    }

}

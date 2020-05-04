package BaiTap;

public class Hello {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Hello: " + name);
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        System.out.println(date);
    }
}

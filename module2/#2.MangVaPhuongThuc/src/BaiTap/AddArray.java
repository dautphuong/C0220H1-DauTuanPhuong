package BaiTap;

public class AddArray {
    public static void main(String[] args) {
        int[]a={3,5,7,9,11,13};
        int[]b={2,4,6,8};
        int[]c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        int index=0;
        for(int j=a.length;j<c.length;j++){
            c[j]=b[index++];
        }
        System.out.println("Phan tu trong mang c:");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+"\t");
        }

    }
}

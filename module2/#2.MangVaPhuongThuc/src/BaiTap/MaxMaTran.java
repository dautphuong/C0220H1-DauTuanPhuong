package BaiTap;

public class MaxMaTran {
    public static void main(String[] args) {
        int [][]mt={{3,2,5,7,9},
                {4,6,1,2,8},
                {12,15,14,17,16}};
        int max=mt[0][0];
        int []index={0,0};
        for(int i=0;i<mt.length;i++){
            for(int j=0;j<mt[i].length;j++){
                if(mt[i][j]>max){
                    max=mt[i][j];
                    index[0]=i;index[1]=j;
                }
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position [" + index[0]+","+index[1]+"]");
    }
}

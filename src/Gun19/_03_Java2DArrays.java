package Gun19;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        int[] array=new int[3];
        int[] array2={34,56,77};
        
        // 2 ders 3 öğrencilik bilgileri bir arada tutacak
        
        int[][] table=new int[2][3];//2 satır 3 sütun
        int[][] table2={{23,44,55},{45,66,77}};
        
        for(int row=0;row<2;row++){
            for(int column=0;column<3;column++){
                System.out.println(row+""+column+" =" + table2[row][column]);
            }
        }
        int sum =0;
        for(int row=0;row<2;row++){
            for(int column=0;column<3;column++){
                sum =sum+table2[row][column];
            }
        }
        System.out.println("sum = " + sum);
    }
}

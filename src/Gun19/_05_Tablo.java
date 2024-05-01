package Gun19;

public class _05_Tablo {
    public static void main(String[] args) {
        //{1,2,3},{2,3,1},{5,5,5},{2,10,3}} int 2d array oluşturun
        // max değeri yazdırın
        
        int[][] numbers={{1,2,3},{2,3,1},{5,5,5},{2,10,3}};
        int maxValue=numbers[0][0];
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if(numbers[i][j]>maxValue)
                    maxValue=numbers[i][j];
            }
        }
        System.out.println("maxValue = " + maxValue);
    }
}

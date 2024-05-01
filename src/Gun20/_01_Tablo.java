package Gun20;

public class _01_Tablo {
    public static void main(String[] args) {
        int[][] table =
                {
                        {1,2,3,4},
                        {1,2},
                        {6,7,55,78,89},
                        {8,9,45}
                };
        for(int i=0;i< table.length;i++)
        {
            for (int j = 0; j < table[i].length; j++) {

                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
}

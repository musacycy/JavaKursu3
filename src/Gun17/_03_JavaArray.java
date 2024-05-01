package Gun17;

public class _03_JavaArray {
    public static void main(String[] args) {
        int[] array1=new int[5];

        int[] array2={5,6,8,5,3,2,7,9,0};//hem uzunluğu hem değerleri verildi

        String[]  words=new String[5];// 5 tane kelime saklayabilen değişken
        Boolean[]  array=new Boolean[5];//5 tane boolean saklayabilen bir dizi değişken
        Double[]  oran=new Double[5];//5 tane double cinsi daklayan diizi


        for (int i=0;i<5;i++){

            System.out.println("dizi1 :"+array1[i]);
        }
        for (int i=0;i<5;i++){

            System.out.println("dizi1 :"+array2[i]);
        }
        for (int i=0;i<5;i++){

            System.out.println("dizi1 :"+words[i]);
        }
        for (int i=0;i<5;i++){

            System.out.println("dizi1 :"+array[i]);
        }
        for (int i=0;i<5;i++){

            System.out.println("dizi1 :"+oran[i]);
        }


    }
}

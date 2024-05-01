package Gun18;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random olarak 100e kadar olan sayılarla doldurunuz
        //sonrasında en büyük olanın indeksini bulunuz
        
        int[] nArray= new int[100];
        int i=0;
        for(i=0;i<100;i++){
            
            nArray[i]=(int) (Math.random()*100);
        }
        int maxnumber=nArray[0];
        int maxindeks=0;
        for(i=0;i<100;i++){
            if(nArray[i]>maxnumber){
                maxnumber=nArray[i];
                maxindeks=i;
            }
        }
        System.out.println("maxnumber :"+maxnumber);
        System.out.println("maxnumber indeksi = " +maxindeks );
    }
}

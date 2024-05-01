package Gun21;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=6;
        int s3=17;
        int s4=45;
        int result1=toplam(s1,s2);
        int result2=toplam(s1,s2,s3);
        int result3=toplam(s1,s2,s3,s4);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }

  /*  public static int toplam(int s1,int s2){
        return s1+s2;
    }
    public static int toplam(int s1,int s2,int s3){
        return s1+s2+s3;
    }
    public static int toplam(int s1,int s2,int s3,int s4){
        return s1+s2;
    }
    */
    public static int toplam(int... numbers){
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        return sum;
    }
}

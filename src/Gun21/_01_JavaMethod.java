package Gun21;

public class _01_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();//giden yok,dönen yok
        toplamYaz(4,5);//giden 4,5 dönen yok
        int enb1=Math.max(4,5);//giden 4,5 dönen 5
        enbYaz(4,5);//giden 4,5 dönen yok
        int enb =enbBul(4,5);
        System.out.println("enb = " + enb);
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }
    public static void toplamYaz(int number1,int number2){
        System.out.println(number1+number2);
    }
    public static void enbYaz(int s1,int s2){
        if(s2>s1){
            System.out.println(s2);
        }
    }
    public static int enbBul(int s1,int s2){
        int enb=s1;
        if(s2>s1){
            enb=s2;
        }
        return  enb;
    }
}

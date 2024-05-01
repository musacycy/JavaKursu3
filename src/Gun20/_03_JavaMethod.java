package Gun20;

public class _03_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();
        ozelMerhabaYaz("Musa");
        ozelMerhabaYaz("Ahmet");
        ozelMerhabaYaz("Nuri");
        ozelMerhabaYaz("Burak");
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba");
    }
    public static void ozelMerhabaYaz(String e){
        System.out.println("Merhaba "+e);
    }
}

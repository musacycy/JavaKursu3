package Gun09;

public class _03_Soru {
    public static void main(String[] args) {
        //2022 yılına kadar geçen gün miktarını bulunuz

        int pastDays = 2022*365;
        int leapDay=2022/4;
        int sum=pastDays+leapDay;


        System.out.println("sum = " + sum);

    }
}

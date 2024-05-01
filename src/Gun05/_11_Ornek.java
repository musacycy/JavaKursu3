package Gun05;

import java.util.Scanner;

public class _11_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan cadde sokak postakodu(int) isteyip adres yazınız
        Scanner input =new Scanner(System.in);

        System.out.print("Cadde adı :");
        String cadde = input.nextLine();
        System.out.print("Sokak numarası :");
        int sokak =input.nextInt();
        System.out.print("Postakodu :");
        int postCode= input.nextInt();

        System.out.println(cadde+" Caddesi "+sokak+" Sokak"+" "+postCode);
    }
}

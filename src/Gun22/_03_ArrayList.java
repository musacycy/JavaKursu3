package Gun22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _03_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(50);
        numbers.add(5);
        numbers.add(456);
        numbers.add(45);
        numbers.add(3);
        System.out.println("numbers ilk hali = " + numbers);

        //sıralama
        Collections.sort(numbers);
        System.out.println("numbers son hali = " + numbers);

        Collections.reverse(numbers);//tersine çevirir
        System.out.println("numbers = " + numbers);

        System.out.println("Collections.max(numbers) = " + Collections.max(numbers));
        System.out.println("Collections.min(numbers) = " + Collections.min(numbers));
        Collections.fill(numbers,0);//bütün elemanları sıfır atar
        System.out.println("numbers = " + numbers);
        Collections.replaceAll(numbers,0,2);
        System.out.println("numbers = " + numbers);
    }
}

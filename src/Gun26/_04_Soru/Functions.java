package Gun26._04_Soru;

import java.util.ArrayList;

public class Functions {
    public static int avgClass(ArrayList<Ogrenci> stdntList){
        int sum=0;
        int avg=0;
        for (int i = 0; i < 3; i++) {
            sum+=stdntList.get(i).note;
        }
        return avg=sum/3;
    }
}

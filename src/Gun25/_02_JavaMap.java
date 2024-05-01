package Gun25;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        //bir kartvizit uygulamasını 2 kişi için yapınız

        Map<String,String > mKartvizit=new HashMap<>();
        mKartvizit.put("isim","Musa");
        mKartvizit.put("email","musacici@windowslive.com");
        mKartvizit.put("adres","İstanbul");
        mKartvizit.put("tel","05347742804");
        System.out.println("sKartvizit.get(\"isim\") = " + mKartvizit.get("isim"));
        System.out.println("sKartvizit.get(\"telefon\") = " + mKartvizit.get("tel"));
        Map<String,String > aKartvizit=new HashMap<>();
        aKartvizit.put("isim","Ahmet");
        aKartvizit.put("email","a.cetinkaya@hotmail.com");
        aKartvizit.put("adres","Polonya");
        aKartvizit.put("tel","05347742805");
        Map<String,Map<String,String >> kartDefteri=new HashMap<>();
        kartDefteri.put("musa",mKartvizit);
        kartDefteri.put("ahmet",aKartvizit);

        System.out.println("kartDefteri.get(\"musa\").get(\"tel\") = " + kartDefteri.get("musa").get("tel"));

        for(Map.Entry<String ,Map<String,String >> kartvizit: kartDefteri.entrySet())
        {
            System.out.println("kartvizit = " + kartvizit);
        }
    }
}

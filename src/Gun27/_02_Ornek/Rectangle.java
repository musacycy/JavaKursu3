package Gun27._02_Ornek;

public class Rectangle {
    int width;
    int length;

    public void cevre(){
        System.out.println(2*(width+length));
    }
    public void alan(){
        System.out.println(width*length);
    }
    public int alan2(){
        return width*length;
    }
}

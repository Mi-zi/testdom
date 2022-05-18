package mizi;

public class CreateClassTest {

    public static void main(String[] args) {

        Person1 liMing = new Person1();
        liMing.name = "Mizi";
        liMing.age = 18;
        System.out.println(liMing.name);
        Person1 liHong = new Person1();
        liHong.name = "Mi Muxin";
        liHong.age = 15;
        System.out.println(liHong.age);
        City gZ = new City();
        gZ.name = "广州";
        gZ.latitude = 39.115;
        gZ.longitude = 116;
        System.out.println(gZ.name);
        System.out.println(gZ.latitude);
        System.out.println(gZ.longitude);
    }

}
class Person1 {
    public String name;
    public int age;
}

class Book {
    public String name;
    public String author;
    public String isbn;
    public double price;
}

class City{
    public String name;
    public double latitude;
    public double longitude;
}

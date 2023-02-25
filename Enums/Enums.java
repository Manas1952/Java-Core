package Enums;

enum names { NAME1, NAME2, NAME3 }

public class Enums {
    public enum Seasons { WINTER, Spring, Summer, rainy;} // ; is optional

    public static void main(String[] args) {

        enum dummy { WINTER, Spring, Summer, rainy,}

        Seasons[] seasons = Seasons.values();

        for (dummy dummy: dummy.values()) {
            System.out.println(dummy);

            System.out.println(dummy.ordinal());
        }

        System.out.println(Seasons.valueOf("Spring"));

        System.out.println(Seasons.valueOf("Spring").ordinal());

        for (names name: names.values()) {
            System.out.println(name);
        }
    }
}

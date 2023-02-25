package Enums;


public class Enums1 {
    enum Seasons { WINTER(5), SUMMER(6), SPRINF(7); // ; is necessary here
        private int value;

        // by default is private
        private Seasons(int value){
            System.out.println("enum constructor");
            this.value = value;
        }
    }

    public static void main(String[] args) {
        for (Seasons Seasons: Seasons.values()) {
            System.out.println(Seasons.value);
        }
    }

}

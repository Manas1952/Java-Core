package Enums;

class Switch {
    enum names { NAME1, NAME2, NAME3 } // can't have same enum

    public static void main(String[] args) {
        names name = names.NAME1; // can't set variable name as 'names'

        switch (name) {
            case NAME1:
                System.out.println("name1");
                break;

            case NAME2:
                System.out.println("name2");
                break;

            case NAME3:
                System.out.println("name3");
                break;
            default:
                System.out.println("other name");
        }
    }
}
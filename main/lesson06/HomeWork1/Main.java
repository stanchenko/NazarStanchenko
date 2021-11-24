package lesson06.HomeWork1;

public class Main {


    public static void main(String[] args) {

        for (DaysOfWeek d : DaysOfWeek.values()) {
            System.out.println(d);
        }
        System.out.println("");
        DaysOfWeek s = DaysOfWeek.FRIDAY;
        System.out.println("Выводит порядковый номер в enam = " + s.ordinal());
    }
}

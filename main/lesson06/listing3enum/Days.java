package lesson06.listing3enum;

public class Days {
    String randomDays = "Friday";

    boolean is = randomDays.contains(Day.MONDAY.name);


    //enum  в середине класск
    enum Day
    {

        MONDAY("M"),
        TUESDAY("T"),
        SUNDAY("Sun");

        String name;

        Day(String name) {
            this.name = name;
        }
    }
}

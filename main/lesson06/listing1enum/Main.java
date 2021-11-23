package lesson06.listing1enum;

public class Main
{
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);



        for (Season s : Season.values())  //используем метод values
            System.out.println("Вывод enum с помощью цикла for " + s);

        Season z = Season.AUTUMN;
        System.out.println("Вывод через указание переменной = " + z.name());
        System.out.println("Выводит порядковый номер в enam = " + z.ordinal());

        // Вывод значения из списка случаев
        Season s2 = Season.WINTER;
        switch (s2) {
            case AUTUMN:
                System.out.println("it is Autumn");
                break;
            case WINTER:
                System.out.println("it is Winter");
                break;
            case SPRING:
                System.out.println("it is Spring");
                break;
            case SUMMER:
                System.out.println("it is Summer");
                break;

            }



            String s3 = Season.WINTER.association;
                System.out.println("Ассоциация к периоду сезона - " + s3);

            int days = Season.SUMMER.days;
            System.out.println(days);
    }
}

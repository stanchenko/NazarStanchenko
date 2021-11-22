package lesson06.listing1;

public enum Season
{
    WINTER("snow", 91 ),
    SUMMER("sun", 90),
    SPRING("8 march", 92),
    AUTUMN("november", 93);

    String association; // объявляем переменную
    int days;

   /* // создаем конструктор
    Season(String name)
    {this.name = name}*/

    //сгенерировать наш параметр

    Season(String name, int days) {
        this.association = name;
        this.days = days;
    }
}

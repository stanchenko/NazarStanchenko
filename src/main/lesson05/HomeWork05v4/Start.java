package lesson05.HomeWork05v4;

public class Start {
    public static void main(String[] args) {
        Boy boyIvan = new Boy();
        Girl girlAnna = new Girl();

        boyIvan.play();
        girlAnna.play();

        //можно создать переменную на основе интерфейса
        Player unit = boyIvan;
    }



}

package lesson05.listing6;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.nonStaticMethod(); // к не статическому методу обращаемся через объект
        //car.staticMethod(); - не возможно
        Car.staticMethod(); // к статическому методу можем обратиться только через класс
       // Car.nonStaticMethod(); - не возможно
        // статические методы не возможно переназначить

        final int RADIUS = 26;
      //  RADIUS = 27; // константы нельзя изменять

        final int RADIUS2;
        RADIUS2 = 26;
      //  RADIUS2 = 27; // константы нельзя изменять
        System.out.println(RADIUS);


    }
}

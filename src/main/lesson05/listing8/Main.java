package lesson05.listing8;

public class Main {
    public static void main(String[] args) {
       // Car car = new Car(); объект для абстрактного класса не может быть создан

        Fiat fiat = new Fiat();
        Toyota toyota = new Toyota();
        VW vw = new VW();

        fiat.type();
        toyota.type();
        vw.type();
        // очень похоже на наследование, разница в том что мы обязываемся наследовать все методы абстрактного класса
    }
}

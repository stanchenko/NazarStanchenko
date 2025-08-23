package lesson05.HomeWork05;

public class Main {

    public static void main(String[] args) {
        Martin martin = new Martin();
        Swan swan = new Swan();
        Platypus platypus = new Platypus();

        martin.type();
        martin.name();
        martin.dia();
        swan.type();
        swan.name();
        swan.dia();
        platypus.type();
        platypus.name();
        platypus.dia();
        platypus.canEat();
    }
}
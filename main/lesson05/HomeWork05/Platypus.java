package lesson05.HomeWork05;

public class Platypus extends Birds implements CanEat, CanSwim {
        String name;
        String type;

    public Platypus() {
        this.name = name;
        this.type = type;
    }

    @Override
    void name() {
        System.out.println("name Platypus ");
    }

    @Override
    void type() {
        System.out.println("Platypus - птах ");
    }

    @Override
    void dia() {
        System.out.println("Platypus - плаваэ ");
    }

    @Override
    public void canSwim() {

    }

    @Override
    public void canEat() {

    }
}

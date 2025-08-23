package lesson05.HomeWork05;

public class Swan extends Birds implements CanEat, CanSwim{
    String name;
    String type;

    public Swan() {
        this.name = name;
        this.type = type;
    }

    @Override
    void name() {
        System.out.println("name Swan ");
    }

    @Override
    void type() {
        System.out.println("Swan - птах ");
    }

    @Override
    void dia() {
        System.out.println("Swan - вміє літати");
    }

    @Override
    public void canSwim() {

    }

    @Override
    public void canEat() {

    }
}

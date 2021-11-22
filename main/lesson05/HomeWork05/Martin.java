package lesson05.HomeWork05;

public class Martin extends Birds implements CanEat, CanFly {

    String name;
    String type;
    String beak;

    public Martin() {
        this.name = name;
        this.type = type;
        this.beak = beak;
    }

    @Override
    void name()
    {
        System.out.println("name Martin");
    }

    @Override
    void type()
    {
        System.out.println("Maritn - птах");
    }

    @Override
    void dia()
    {
        System.out.println("Maritn - вміє літати");
    }

    @Override
    public void canEat() {

    }

    @Override
    public void CanFly() {

    }

    @Override
    public void CanSwim() {

    }

    @Override
    public double Speed(double val) {
        return 0;
    }
}

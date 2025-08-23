package lesson05.listing6;

public class SportCar extends Car
{
    @Override
    public void nonStaticMethod()  // статические методы нельзя переназначать = делать оверайд
    {
        super.nonStaticMethod();
    }
}

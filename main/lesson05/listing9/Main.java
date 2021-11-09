package lesson05.listing9;

public class Main
{
    Fiat fiat = new Fiat();
    public static void main(String[] args)
    {

    }

    void testCar(Car car)
    {
        car.kermo();
    }

    void testCarWithPedali(CarWithPedali carWithPedali)
    {
        carWithPedali.pedali();
        carWithPedali.kermo();
    }

    void test()
    {
        testCar(fiat);
        testCarWithPedali(fiat);
    }
}

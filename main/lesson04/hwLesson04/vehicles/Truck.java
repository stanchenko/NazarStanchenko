package lesson04.hwLesson04.vehicles;


import lesson04.hwLesson04.details.Engine;
import lesson04.hwLesson04.professions.Driver;

public class Truck extends Car
{
    public int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public Truck(String brand, String type, int weight, Driver driver, Engine engine, int carrying) {
        super(brand, type, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "carrying=" + carrying +
                '}';
    }
}

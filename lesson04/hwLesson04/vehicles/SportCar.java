package hwLesson04.vehicles;

import hwLesson04.details.Engine;
import hwLesson04.professions.Driver;

public class SportCar extends Car
{
    private double speed;

    //создадим конструктор


    public SportCar(String brand, String type, int weight, Driver driver, Engine engine, double speed) {
        super(brand, type, weight, driver, engine);
        this.speed = speed;
    }



    // создадим геттеры и сеттеры

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //создадим toString

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}

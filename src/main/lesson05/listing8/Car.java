package lesson05.listing8;

public abstract class Car
{
    abstract void type();
    /*{
        System.out.println("Car");
    }*/ // абстрактный класс не может иметь тело,  в подсказке иде говорится что надо удалить тело метода
    // абстрактные методы не имеют реализации
    abstract void drive();
}

package lesson05.listing5;

public class Main {
    public static void main(String[] args) {
       Car car = new Car();
        System.out.println(car.nonStatic); // обращения к переменно через создание объекта
        System.out.println(Car.myStatic); // можем обращаться к объектам без создания статического метода

        System.out.println("добавили значени 10 к обеим переменным ");
        car.nonStatic  = car.nonStatic + 10; //можно заменить Car.myStatic +=10
        System.out.println("nonStatic " + car.nonStatic);


        Car.myStatic = Car.myStatic + 10; //можно заменить Car.myStatic +=10
        System.out.println("Static " + Car.myStatic);
        System.out.println("обращение через созданный второй объект ");
        Car car1 = new  Car();
        System.out.println("nonStatic " + car1.nonStatic);
        System.out.println("Static " + car1.myStatic);
    }
}

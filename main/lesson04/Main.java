package lesson04;


import lesson04.details.Engine;
import lesson04.professions.Driver;
import lesson04.vehicles.SportCar;
import lesson04.vehicles.Truck;

public class Main {
    public static void main(String[] args) {

        // Создадим объект Driver который на входе будит иметь 4 параметра (два параметра из своего класса
        // и два параметра от родительского класса)
      Driver driver = new Driver("Vova", 5,30,"Vova Kovalchuk");
      Engine engine = new Engine(100, "BMW");
      Driver driver1 = new Driver("Nazar", 5,39, "Nazar Stanchenko");
      Engine engine1 = new Engine(200,"VW");
      SportCar sportCar = new SportCar("Lotus","sport",1200,driver,engine, 250.5);
      Truck truck = new Truck("MAN", "truk", 5000,driver1,engine1, 20);


      System.out.println(sportCar);
      //System.out.println(Truck(););



    }
}

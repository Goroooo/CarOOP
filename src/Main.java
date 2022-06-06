import model.Car;
import service.CarService;

public class Main {
    public static void main(String[] args) {

        CarService service = new CarService();
        Car c1 = service.info();
        Car c2 = service.info();
        Car c3 = service.info();
        Car[] cars = {c1, c2, c3};

//        service.highestPrice(cars);
//        System.out.println("- - - - - - - - - - - -");
//        service.countBMW(cars);
//        System.out.println("- - - - - - - - - - - -");
//        service.superCar(cars);
//        System.out.println("- - - - - - - - - - - -");
        service.expensiveSuperCar(cars);
    }
}

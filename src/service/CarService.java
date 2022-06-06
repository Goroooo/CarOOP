package service;

import model.Car;

import java.util.Objects;
import java.util.Scanner;

public class CarService {

    public Car info() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Model: ");
        String model = s.next();
        System.out.println("Enter Colour: ");
        String colour = s.next();
        System.out.println("Enter Price: ");
        int price = s.nextInt();
        System.out.println("Enter is Sport Car true/false: ");
        boolean isSportCar = s.nextBoolean();
        System.out.println("Enter Speed: ");
        int speed = s.nextInt();
        return new Car(model, colour, price, isSportCar, speed);
    }

    public void highestPrice(Car[] cars) {
        Car maxPrice = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice() > maxPrice.getPrice()) {
                maxPrice = cars[i];
            }
        }
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice() == maxPrice.getPrice()) {
                cars[i].printInfo();
                System.out.println();
            }
        }
    }


    public void countBMW(Car[] cars) {
        int count = 0;
        for (Car car : cars) {
            if (Objects.equals(car.getModel(), "BMW")) {
                count++;
                car.printInfo();
                System.out.println();
            }
        }
        if (count != 0) {
            System.out.println("BMW count: " + count);
        } else {
            System.out.println("BMW not found");
        }
    }

    public void superCar(Car[] cars) {
        for (Car car : cars) {
            if (car.isSportCar() && car.getSpeed() > 300) {
                car.printInfo();
                System.out.println();
            } else {
                System.out.println("No Super Cars");
            }
        }
    }

    public void expensiveSuperCar(Car[] cars) {
        Car min = cars[0];
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].isSportCar() && cars[i].getPrice() > min.getPrice()) {
                min = cars[i];
                count++;
            }
        }
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].isSportCar() && cars[i].getPrice() == min.getPrice()) {
                cars[i].printInfo();
                System.out.println();
            }
        }
        if (count == 0) {
            System.out.println("No expensive super cars");
        }
    }
}





package model;

public class Car {

    private String model;
    private String colour;
    private int price;
    private boolean isSportCar;
    private int speed;

    public Car(String model, String colour, int price, boolean isSportCar, int speed) {
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.isSportCar = isSportCar;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
    }

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Price: " + price);
        System.out.println("is a Sport Car: " + isSportCar);
        System.out.println("Speed: " + speed);
    }
}

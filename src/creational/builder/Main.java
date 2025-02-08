package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.builders.CarManualBuilder;
import creational.builder.cars.Manual;
import creational.builder.director.Director;
import creational.builder.cars.Car;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructionSportCar(carBuilder);

        //The final product is retrieved from the builder object
        //The director is not aware and not dependent from concrete builders and products
        Car car = carBuilder.getResult();
        System.out.println("Car built: " + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructionSportCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("Car manual built: " + manual.print());
    }
}

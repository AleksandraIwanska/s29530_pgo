import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", 2015));
        cars.add(new Car("Honda", 2010));
        cars.add(new Car("BMW", 2020));
        cars.add(new Car("Ford", 2008));
        cars.add(new Car("Chevrolet", 2018));
        cars.add(new Car("Nissan", 2012));
        cars.add(new Car("Audi", 2019));
        cars.add(new Car("Mercedes", 2016));
        cars.add(new Car("Volkswagen", 2014));
        cars.add(new Car("Hyundai", 2017));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.getModel() + " - " + car.getYear());
        }
    }
}

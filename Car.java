public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public static void main(String[] args) {
        Car car = new Car(4);
        car.start();
        car.stop();
        int seats = car.getNumberOfSeats();
        System.out.println("Number of seats in the car: " + seats);
    }
}


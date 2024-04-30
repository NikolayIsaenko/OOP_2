public class Main {
    public static void main(String[] args) {

        ServiceStantion serviceStantion = new ServiceStantion();
        Car car = new Car("car", 4);
        serviceStantion.check(car);

        Bicycle bicycle = new Bicycle("велик", 2);
        serviceStantion.check(bicycle);

        Truck truck = new Truck("truck", 8);
        serviceStantion.check(truck);
        }
    }

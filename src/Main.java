public class Main {
    public static void main(String[] args) {

        ServiceStantion serviceStantion = new ServiceStantion();

        Transport[] transports = new Transport[7];
        transports[0] = new Bicycle("bicycle1", 2);
        transports[1] = new Bicycle("bicycle2", 2);
        transports[3] = new Car("car1", 4);
        transports[4] = new Car("car2", 4);
        transports[5] = new Truck("truck1", 4);
        transports[6] = new Truck("truck2", 6);
        for (Transport transport : transports) {
            serviceStantion.check(transport);
        }
    }
}
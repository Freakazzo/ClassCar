public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.start();

//        Rideble mazda = new Car();
//        Rideble boat = new Boat();
//        mazda.ride();
//        boat.ride();
        Boat boat = new Boat();
        Transport transport = new Transport();
        rideSomeTransport(sedan);
        rideSomeTransport(boat);
        rideSomeTransport(transport);


//        Car lada = new Car("Lada", 123, false, 20);
//        System.out.println(mazda.countSpeed(5));
//        System.out.println(lada.countSpeed(5));


//        mazda.start();
//        S ystem.out.println(mazda.acceleration);
//        lada.start();
//        System.out.println(lada.acceleration);
    }

    public static void rideSomeTransport(Rideble rideble) {
        rideble.ride();
    }
}
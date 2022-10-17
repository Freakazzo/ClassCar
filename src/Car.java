public class Car extends Transport implements Rideble{
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;

    Car() {
        this("Mazda", 190, false, 10);

    }

    Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        type = "Car";
    }

    void start() {
        System.out.println(brand + " has been started");
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    float countSpeed(float time) {
        return (100 / acceleration) * time;
    }

    @Override
    public void ride() {
        System.out.println("Riding car");
    }
}

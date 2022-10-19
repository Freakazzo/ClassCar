public abstract class Car extends Transport implements Rideble {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;

    public Car() {
        this("Mazda", 190, false, 10);

    }

    Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        type = "Car";
    }

    abstract void start();

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

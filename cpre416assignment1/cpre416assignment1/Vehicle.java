package cpre416assignment1;

public abstract class Vehicle implements Drivable {
    private final String make;
    private final String model;
    private final int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void stopEngine();

    // Getters
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }

}
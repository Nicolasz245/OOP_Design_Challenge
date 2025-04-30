package cpre416assignment1;

public interface Drivable {
    /**
     * Starts the vehicle engine.
     */
    void startEngine();

    /**
     * Accelerates the vehicle to a given speed.
     * @param speed target speed in km/h
     */
    void accelerate(int speed);

}
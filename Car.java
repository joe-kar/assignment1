import java.awt.*;

public class Car implements Movable{
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double x = 0;
    private double y = 0;
    private int direction = 0;

    public Car(int nrDoors, Color color, double enginePower, String modelName) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        stopEngine();
    }

    public int getNrDoors() {
        return nrDoors;
    }
    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    private void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    private void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    // TODO fix this method according to lab pm
    public void gas(double amount) {
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        decrementSpeed(amount);
    }

    protected double speedFactor() {
        return 1;
    }

    public void move() {
        if (direction == 0) {
            x += currentSpeed;
        } else if (direction == 1) {
            y += currentSpeed;
        } else if (direction == 2) {
            x -= currentSpeed;
        } else if (direction == 3) {
            y -= currentSpeed;
        }
    }

    public void turnLeft() {
        direction += 1;
        direction %= 4;
    }

    public void turnRight() {
        direction += 3;
        direction %= 4;
    }

    public double[] getCoords() {
        return new double[]{x, y};
    }
}
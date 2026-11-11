import java.awt.*;

public class CarTest {
    private static void reportResult(String testname, boolean result) {
        System.out.printf("%s Result: %s\n", testname, (result) ? "Success" : "Failure");
    }

    private static boolean abstractCarStartsAt0() {
        Car car1 = new Car(4, Color.black, 240, "Supra");
        return car1.getCurrentSpeed() == 0;
    }

    private static boolean abstractCarGas() {
        Car car1 = new Car(4, Color.black, 240, "Supra");
        double speed1 = car1.getCurrentSpeed();
        car1.gas(0.5);
        double speed2 = car1.getCurrentSpeed();
        return speed1 < speed2;
    }

    private static boolean abstractCarBrake() {
        Car car1 = new Car(4, Color.black, 240, "Supra");
        car1.gas(0.5);
        double speed1 = car1.getCurrentSpeed();
        car1.brake(0.4);
        double speed2 = car1.getCurrentSpeed();
        return speed1 > speed2;
    }

    private static boolean abstractCarMove() {
        Car car1 = new Car(4, Color.black, 240, "Supra");
        double x1 = car1.getCoords()[0];
        car1.gas(0.5);
        car1.move();
        double x2 = car1.getCoords()[0];
        return x1 < x2;
    }

    private static boolean abstractCarTurnMove() {
        Car car1 = new Car(4, Color.black, 240, "Supra");
        double y1 = car1.getCoords()[1];
        car1.gas(0.5);
        car1.turnLeft();
        car1.move();
        double y2 = car1.getCoords()[1];
        return y1 < y2;
    }

    private static boolean testTurbo() {
        Saab95 slowSaab = new Saab95();
        Saab95 fastSaab = new Saab95();
        fastSaab.setTurboOn();
        slowSaab.setTurboOff();
        fastSaab.gas(0.5);
        slowSaab.gas(0.5);
        return slowSaab.getCurrentSpeed() < fastSaab.getCurrentSpeed();
    }

    private static boolean trimTest() {
        Car gen_car = new Car(4, Color.black, 100, "Generic Car");
        Volvo240 valve = new Volvo240();
        gen_car.gas(0.5);
        valve.gas(0.5);
        return valve.getCurrentSpeed() > gen_car.getCurrentSpeed();
    }

    public static void main(String[] args) {
        reportResult("Initialize test suite.", true);
        reportResult("Check if car starts at rest.", abstractCarStartsAt0());
        reportResult("Check if gassing makes car go faster.", abstractCarGas());
        reportResult("Check if braking makes car go slower.", abstractCarGas());
        reportResult("Check if car moves.", abstractCarMove());
        reportResult("Check if car turns and moves.", abstractCarTurnMove());
        reportResult("Test the turbo on the Saab95.", testTurbo());
        reportResult("Test the trim on the Volvo240.", trimTest());
    }
}
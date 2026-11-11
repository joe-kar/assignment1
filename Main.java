import java.awt.*;

class Main{
    public static void main(String[] args) {
        Car car1 = new Car(4, Color.black, 240, "Supra");
        System.out.printf("Car: %f engine power, %d doors.\n", car1.getEnginePower(), car1.getNrDoors());
        System.out.printf("1: %fkph at (%f, %f)\n", car1.getCurrentSpeed(), car1.getCoords()[0], car1.getCoords()[1]);
        car1.gas(100);
        car1.move();
        System.out.printf("1: %fkph at (%f, %f)\n", car1.getCurrentSpeed(), car1.getCoords()[0], car1.getCoords()[1]);

        Saab95 car2 = new Saab95();
        Saab95 car3 = new Saab95();
        System.out.printf("2: %fkph at (%f, %f)\n", car2.getCurrentSpeed(), car2.getCoords()[0], car2.getCoords()[1]);
        car2.gas(100);
        car2.turnLeft();
        car2.move();
        System.out.printf("2: %fkph at (%f, %f)\n", car2.getCurrentSpeed(), car2.getCoords()[0], car2.getCoords()[1]);

        System.out.printf("3: %fkph at (%f, %f)\n", car3.getCurrentSpeed(), car3.getCoords()[0], car3.getCoords()[1]);
        car3.setTurboOn();
        car3.gas(100);
        car3.turnRight();
        car3.move();
        System.out.printf("3: %fkph at (%f, %f)\n", car3.getCurrentSpeed(), car3.getCoords()[0], car3.getCoords()[1]);

        Volvo240 car4 = new Volvo240();
        System.out.printf("4: %fkph at (%f, %f)\n", car4.getCurrentSpeed(), car4.getCoords()[0], car4.getCoords()[1]);
        car4.gas(100);
        car4.turnRight();
        car4.move();
        car4.turnLeft();
        car4.move();
        System.out.printf("4: %fkph at (%f, %f)\n", car4.getCurrentSpeed(), car4.getCoords()[0], car4.getCoords()[1]);
    }
}
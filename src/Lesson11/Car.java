package Lesson11;

public class Car {
    public String color;
    public String engine;
    public int countOfDoors;
    public Car(String color, String engine, int countOfDoors) {
        this.color = color;
        this.engine = engine;
        this.countOfDoors = countOfDoors;
    }
    }
class CarTest {
    void changeOfDoors (Car e, int a) {
        e.countOfDoors = a;
    }
    static void changeOfPosition (Car a, Car b) {
        String c = a.color;
        a.color = b.color;
        b.color = c;
    }

    public static void main(String[] args) {
        CarTest er = new CarTest();
        Car c = new Car("red", "v4", 2);
        Car d = new Car("black", "v6", 4);

        er.changeOfDoors(c, 4);
        changeOfPosition(c, d);
        System.out.println(c.color + " " + c.engine + " " + c.countOfDoors);
        System.out.println(d.color + " " + d.engine + " " + d.countOfDoors);
    }
}

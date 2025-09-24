package oop.solid.dip;

public class Car {

    private Tire frontLeft;
    private Tire frontRight;
    private Tire backLeft;
    private Tire backRight;

    public Car(Tire hankookTire, Tire tire, Tire michelinTire, Tire michelinTire1) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

    public void drive() {
        frontLeft.roll();
        frontRight.roll();
        backLeft.roll();
        backRight.roll();
    }


}

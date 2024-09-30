package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehiculo acendido");
        } else {
            System.out.println("O vehiculo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println("Non se pode apagar o vehiculo, primero ten que estar detido");
        }
    }

    public void accelerate() {
        int newSpeed = this.speedometer, prevSpeed;
        while (newSpeed < MAX_SPEED) {
            newSpeed = newSpeed + 1;
            this.speedometer = newSpeed;
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            while (this.speedometer > 0) {
                this.speedometer = this.speedometer - 1;
            }
        }
    }

    public void turnAngleOfWheels(int angle) {
        this.wheelsAngle = this.wheelsAngle + angle;
        if (this.wheelsAngle < -45) {
            this.wheelsAngle = -45;
        }
        if (this.wheelsAngle > 45) {
            this.wheelsAngle = 45;
        }
    }

    /*public String showSteeringWheelDetail(){}*/
    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (reverse && this.speedometer == 0) {
            this.gear = "R";
        }
    }

    public void showDetails() {
    }

    public boolean isTachometerGreaterThanZero() {
        if (this.tachometer > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTachometerEqualToZero() {
        if (this.tachometer == 0) {
            return true;
        } else {
            return false;
        }
    }
}

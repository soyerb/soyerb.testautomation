package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Planet {
    private int sequenceNumber;
    private double distance;
    private double radius;
    private double rotationPeriod;

    public Planet(int sequenceNumber, double distance, double radius, double rotationPeriod) {
        this.sequenceNumber = sequenceNumber;
        this.distance = distance;
        this.radius = radius;
        this.rotationPeriod = rotationPeriod;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public double getDistance() {
        return distance;
    }

    public double getRadius() {
        return radius;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    @Override
    public String toString() {
        return "Planet " + sequenceNumber + ": Distance=" + distance + " billion km, Radius=" + radius + " million km, Rotation Period=" + rotationPeriod + " hours";
    }
}


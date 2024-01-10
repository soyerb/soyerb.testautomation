package org.example;

public class SolarSystem {
    public static void main(String[] args) {
        Planet[] planets = new Planet[8];

        planets[0] = new Planet(1, 929.0, 6052.0, 24.0); // Mercury
        planets[1] = new Planet(2, 1215.0, 6378.0, 24.0); // Venus
        planets[2] = new Planet(3, 1496.0, 6378.0, 24.0); // Earth
        planets[3] = new Planet(4, 2279.0, 3397.0, 24.6); // Mars
        planets[4] = new Planet(5, 3653.0, 24764.0, 9.2); // Jupiter
        planets[5] = new Planet(6, 5566.0, 60268.0, 27.3); // Saturn
        planets[6] = new Planet(7, 8482.0, 25388.0, 16.7); // Uranus
        planets[7] = new Planet(8, 12353.0, 24973.0, 8.7); // Neptune

        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }
}
/**
 * File Name: Torus.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Torus which uses class Volume with the radius and majorRadius
 */

class Torus extends ThreeDimensionalShape {
    public void construct(double r, double m) {

        radius = r;
        majorRadius = m;
        v.torus(radius, majorRadius);
    }
}
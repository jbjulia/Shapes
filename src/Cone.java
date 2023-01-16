/**
 * File Name: Cone.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Cone which uses class Volume with the radius and height
 */

class Cone extends ThreeDimensionalShape {
    public void construct(double r, double h) {

        radius = r;
        height = h;
        v.cone(radius, height);
    }
}
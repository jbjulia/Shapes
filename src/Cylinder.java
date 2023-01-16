/**
 * File Name: Cylinder.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Cylinder which uses class Volume with the radius and height
 */

class Cylinder extends ThreeDimensionalShape {
    public void construct(double r, double h) {

        radius = r;
        height = h;
        v.cylinder(radius, height);
    }
}
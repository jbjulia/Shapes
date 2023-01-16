/**
 * File Name: Sphere.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Sphere which uses class Volume with the radius
 */

class Sphere extends ThreeDimensionalShape {
    public void construct(double r) {

        radius = r;
        v.sphere(radius);
    }
}
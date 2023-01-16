/**
 * File Name: Cube.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Cube which uses class Volume with the length, width, and height
 */

class Cube extends ThreeDimensionalShape {
    public void construct(double l, double w, double h) {

        length = l;
        width = w;
        height = h;
        v.cube(length, width, height);
    }
}
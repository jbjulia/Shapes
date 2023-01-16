/**
 * File Name: Triangle.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Triangle which uses class Area with the base and height
 */

class Triangle extends TwoDimensionalShape {
    public void construct(double b, double h) {

        base = b;
        height = h;
        a.triangle(base, height);
    }
}
/**
 * File Name: Circle.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Circle which uses class Area with the radius
 */

class Circle extends TwoDimensionalShape {
    public void construct(double r) {

        radius = r;
        a.circle(radius);
    }
}
/**
 * File Name: Rectangle.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Rectangle which uses class Area with the length and height
 */

class Rectangle extends TwoDimensionalShape {
    public void construct(double l, double h) {

        length = l;
        height = h;
        a.rectangle(length, height);
    }
}
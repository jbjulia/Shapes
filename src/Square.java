/**
 * File Name: Square.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Square which uses class Area with the length
 */

class Square extends TwoDimensionalShape {
    public void construct(double l) {

        length = l;
        a.square(length);
    }
}
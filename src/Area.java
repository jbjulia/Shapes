import java.text.DecimalFormat;

/**
 * File Name: Area.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Area to calculate the Area of 2D Shapes
 */

class Area {

    public void circle(double r) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double area = Math.PI * (r * r);
        System.out.print(numberFormat.format(area) + "\n");

    }

    public void square(double l) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double area = l * l;
        System.out.print(numberFormat.format(area) + "\n");

    }

    public void triangle(double b, double h) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double area = (b * h) / 2;
        System.out.print(numberFormat.format(area) + "\n");

    }

    public void rectangle(double l, double h) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double area = l * h;
        System.out.print(numberFormat.format(area) + "\n");

    }
}
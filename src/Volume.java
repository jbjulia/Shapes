import java.text.DecimalFormat;

/**
 * File Name: Volume.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Creates class Volume to calculate the Volume of 3D Shapes
 */

class Volume {

    public void sphere(double r) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (4.0 / 3.0 * Math.PI) * (r * r * r);
        System.out.print(numberFormat.format(volume) + "\n");

    }

    public void cube(double l, double w, double h) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (l * w * h);
        System.out.print(numberFormat.format(volume) + "\n");

    }

    public void cone(double r, double h) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (1.0 / 3) * (Math.PI * (r * r)) * h;
        System.out.print(numberFormat.format(volume) + "\n");

    }

    public void cylinder(double r, double h) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (Math.PI * (r * r)) * h;
        System.out.print(numberFormat.format(volume) + "\n");

    }

    public void torus(double r, double m) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (Math.PI * (r * r) * (2 * (Math.PI * m)));
        System.out.print(numberFormat.format(volume) + "\n");

    }
}
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * File Name: Main.java
 * Date: 15 JAN 2023
 * Author: Joseph Julian
 * Purpose: Uses Java Inheritance to create a series of related classes with a "shape" theme
 */

public class Main {

    /*
    ANSI attributes to enhance user experience
     */
    public static final String ANSI_BOLD_GREEN = "\u001B[1m\u001B[32m";

    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        String response;
        int selection;
        double radius, length, height, width, base, majorRadius;
        boolean firstSelection = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Shapes - Java Inheritance Edition\n");

        while (true) {
            if (!firstSelection) {
                System.out.println(ANSI_RESET + "\nWould you like to continue? (Y/N): ");
                response = input.next();
                if (response.equalsIgnoreCase("N")) {
                    Date date = new Date();
                    System.out.println("\nThanks for using my program! Today's date and time is:\t" + date);
                    System.exit(0); // User does not wish to continue, print date/time and exit
                } else if (!response.equalsIgnoreCase("Y")) {
                    System.out.println(ANSI_YELLOW + "\nSorry, I do not understand. Goodbye!");
                    System.exit(0); // Unable to parse user input, system exit
                }
            }

            System.out.println("1.)\t\tConstruct a Circle");
            System.out.println("2.)\t\tConstruct a Rectangle");
            System.out.println("3.)\t\tConstruct a Square");
            System.out.println("4.)\t\tConstruct a Triangle");
            System.out.println("5.)\t\tConstruct a Sphere");
            System.out.println("6.)\t\tConstruct a Cube");
            System.out.println("7.)\t\tConstruct a Cone");
            System.out.println("8.)\t\tConstruct a Cylinder");
            System.out.println("9.)\t\tConstruct a Torus");
            System.out.println("10.)\tExit\n");
            System.out.println("Please make a selection from the menu above (e.g. 1): ");

            try {
                selection = input.nextInt();
                firstSelection = false;
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "\nSorry, that is not a valid selection. Please try again. (" + e + ")");
                break; // Exception caught, break loop
            }


            try {
                switch (selection) {
                /*
                Constructs a Circle
                 */
                    case 1 -> {
                        System.out.println("\nWhat is the radius?: ");
                        radius = input.nextDouble();
                        System.out.print("\nThe area of the circle is: " + ANSI_BOLD_GREEN);
                        Circle circle = new Circle();
                        circle.construct(radius);
                    }

                /*
                Construct a Rectangle
                 */
                    case 2 -> {
                        System.out.println("\nWhat is the length?: ");
                        length = input.nextDouble();
                        System.out.println("\nWhat is the height?: ");
                        height = input.nextDouble();
                        System.out.print("\nThe area of the rectangle is: " + ANSI_BOLD_GREEN);
                        Rectangle rectangle = new Rectangle();
                        rectangle.construct(length, height);
                    }

                /*
                Construct a Square
                 */
                    case 3 -> {
                        System.out.println("\nWhat is the length?: ");
                        length = input.nextDouble();
                        System.out.print("\nThe area of the square is: " + ANSI_BOLD_GREEN);
                        Square square = new Square();
                        square.construct(length);
                    }

                /*
                Construct a Triangle
                 */
                    case 4 -> {
                        System.out.println("\nWhat is the base?: ");
                        base = input.nextDouble();
                        System.out.println("\nWhat is the height?: ");
                        height = input.nextDouble();
                        System.out.print("\nThe area of the triangle is: " + ANSI_BOLD_GREEN);
                        Triangle triangle = new Triangle();
                        triangle.construct(base, height);
                    }

                /*
                Construct a Sphere
                 */
                    case 5 -> {
                        System.out.println("\nWhat is the radius?: ");
                        radius = input.nextDouble();
                        System.out.print("\nThe volume of the sphere is: " + ANSI_BOLD_GREEN);
                        Sphere sphere = new Sphere();
                        sphere.construct(radius);
                    }

                /*
                Construct a Cube
                 */
                    case 6 -> {
                        System.out.println("\nWhat is the length?: ");
                        length = input.nextDouble();
                        System.out.println("\nWhat is the width?: ");
                        width = input.nextDouble();
                        System.out.println("\nWhat is the height?: ");
                        height = input.nextDouble();
                        System.out.print("\nThe volume of the cube is: " + ANSI_BOLD_GREEN);
                        Cube cube = new Cube();
                        cube.construct(length, width, height);
                    }

                /*
                Construct a Cone
                 */
                    case 7 -> {
                        System.out.println("\nWhat is the radius?: ");
                        radius = input.nextDouble();
                        System.out.println("\nWhat is the height?: ");
                        height = input.nextDouble();
                        System.out.print("\nThe volume of the cone is: " + ANSI_BOLD_GREEN);
                        Cone cone = new Cone();
                        cone.construct(radius, height);
                    }

                /*
                Construct a Cylinder
                 */
                    case 8 -> {
                        System.out.println("\nWhat is the radius?: ");
                        radius = input.nextDouble();
                        System.out.println("\nWhat is the height?: ");
                        height = input.nextDouble();
                        System.out.print("\nThe volume of the cylinder is: " + ANSI_BOLD_GREEN);
                        Cylinder cylinder = new Cylinder();
                        cylinder.construct(radius, height);
                    }

                /*
                Construct a Torus
                 */
                    case 9 -> {
                        System.out.println("\nWhat is the major radius?: ");
                        majorRadius = input.nextDouble();
                        System.out.println("\nWhat is the radius?: ");
                        radius = input.nextDouble();
                        System.out.print("\nThe volume of the torus is: " + ANSI_BOLD_GREEN);
                        Torus torus = new Torus();
                        torus.construct(radius, majorRadius);
                    }

                /*
                Exit and print date
                 */
                    case 10 -> {
                        Date date = new Date();
                        System.out.println("Thanks for using my program! Today's date and time is:\t" + date);
                        System.exit(0);
                    }

                /*
                Default, or invalid input
                 */
                    default ->
                            System.out.println(ANSI_YELLOW + "\nSorry, that's not a valid selection. Please try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "\nSorry, your input is invalid. Please try again. (" + e + ")");
                break;
            }
        }
    }
}
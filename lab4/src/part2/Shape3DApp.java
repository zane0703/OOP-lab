package part2;

import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the total number of 3D shapes: ");
        int shapeAmount = input.nextInt();
        Shape3D[] shapes = new Shape3D[shapeAmount];
        for (int i = 0; i < shapeAmount; ++i) {
            do {
                System.out.print("\n1 Sphere\n2 Pyramid\n3 Cubiod\nchoose the shape: ");
                int choose = input.nextInt();
                switch (choose) {
                    case 1:
                    {
                        System.out.print("\nwhat is the length of the Sphere: ");
                        int length = input.nextInt();
                        shapes[i] = new Sphere(length);
                        break;
                    }
                    case 2:
                    {
                        System.out.print("\nWhat is the height of the pyramid: ");
                        int height = input.nextInt();
                        System.out.print("\nWhat is the base length of the pyramid: ");
                        int baseLength = input.nextInt();
                        System.out.print("\nWhat is the base width of the pyramid: ");
                        int baseWidth = input.nextInt();
                        shapes[i] = new Pyramid(height, baseLength, baseWidth);
                        break;
                    }
                    case 3:
                    {
                        System.out.print("\nWhat is the length of the cubiod: ");
                        int length = input.nextInt();
                        System.out.print("\nWhat is the width of the cubiod: ");
                        int width = input.nextInt();
                        System.out.print("\nWhat is the height  of the cubiod: ");
                        int height = input.nextInt();
                        shapes[i] = new Cubiod(length,width,height);
                        break;
                    }
                    default:
                        System.out.printf("*** invalid input ***");
                        continue;

                }
                break;
            } while (true);
        }
        do {
            System.out.print("\n1 surface area\n2 volume\n0 Exit\nchoose the type of calculation: ");
            int choose = input.nextInt();
            if (choose == 0) break;
            switch (choose) {
                case 1:
                {
                    double area = getSurfaceArea(shapes);
                    System.out.println("The total area is " + area);
                    break;
                }
                case 2:
                {
                    double volume = getVolume(shapes);
                    System.out.println("The total volume is " + volume);
                }
            }
        }while (true);
    }

    public static double getSurfaceArea(Shape[] shapes) {
        double surfaceArea = 0.0;
        for (Shape shape: shapes) {
            surfaceArea += shape.getArea();
        }
        return surfaceArea;
    }
    public static double getVolume(Shape3D[] shapes) {
        double volume = 0.0;
        for (Shape3D shape: shapes) {
            volume += shape.getVolume();
        }
        return volume;
    }
}

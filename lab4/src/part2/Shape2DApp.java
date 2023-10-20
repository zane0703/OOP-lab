package part2;
import java.util.Scanner;
public class Shape2DApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the total number of shapes: ");
        int shapeAmount = input.nextInt();
        Shape[] shapes = new Shape[shapeAmount];
        for (int i = 0; i < shapeAmount; ++i) {
            do {
                System.out.print("\n1 Square\n2 Rectangle\n3 Circle\n4 Triangle\nchoose the shape: ");
                int choose = input.nextInt();
                switch (choose) {
                    case 1:
                    {
                        System.out.print("\nwhat is the length of the Square: ");
                        int length = input.nextInt();
                        shapes[i] = new Square(length);
                        break;
                    }
                    case 2:
                    {
                        System.out.print("\nWhat is the length of the rectangle: ");
                        int length = input.nextInt();
                        System.out.print("\nWhat is the width of the rectangle: ");
                        int width = input.nextInt();
                        shapes[i] = new Rectangle(length, width);
                        break;
                    }
                    case 3:
                    {
                        System.out.print("\nWhat is the radius of the circle: ");
                        int radius = input.nextInt();
                        shapes[i] = new Circle(radius);
                        break;
                    }
                    case 4:
                    {
                        System.out.print("\nWhat is the height of the triangle: ");
                        int height = input.nextInt();
                        System.out.print("\nWhat is the base length of the triangle: ");
                        int baseLength = input.nextInt();
                        shapes[i] = new Triangle(height, baseLength);
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
            System.out.print("\n1 Area \n0 Exit\nchoose the type of calculation: ");
            int choose = input.nextInt();
            if (choose == 0) break;
            switch (choose) {
                case 1: {
                    double area = getArea(shapes);
                    System.out.println("The total area is " + area);
                }
            }
        }while (true);

    }

    public static double getArea(Shape[] shapes) {
        double area = 0.0;
        for (Shape shape: shapes) {
            area += shape.getArea();
        }
        return area;
    }
}

package part2;

public class Rectangle implements Shape {
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    /*@Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }*/

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}

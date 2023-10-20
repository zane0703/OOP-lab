package part2;

import java.util.Map;

public class Square implements Shape{
    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(length,2);
    }

  /*  @Override
    public double getPerimeter() {
        return this.length * 4;
    }*/
}

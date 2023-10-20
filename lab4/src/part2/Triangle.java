package part2;

import java.util.Map;

public class Triangle implements Shape{
    private int height;
    private int baseLength;
    public Triangle(int height,  int  baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }

    @Override
    public double getArea() {
        return ((double)(baseLength * height))/2;
    }

  /*  @Override
    public double getPerimeter() {
        //only work for right angle triangle
        return  this.height + this.baseLength + this.getHypotenuse();
    }*/

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(this.height,2) + Math.pow(this.baseLength,2));
    }
    public int getHeight() {
        return height;
    }
    public int getBaseLength() {
        return baseLength;
    }
}

package part2;

public class Circle implements Shape{
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

   /* @Override
    public double getPerimeter() {
        return 2 * Math.PI  * radio;
    }*/

    public int getRadio() {
        return radio;
    }
}

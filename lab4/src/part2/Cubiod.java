package part2;

public class Cubiod extends Rectangle implements Shape3D{
    int height;
    public Cubiod(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
    @Override
    public double getArea() {
        int length = super.getLength();
        int width = super.getWidth();
        return 2* width * length + 2* length * height + 2 * width * height;
    }

    @Override
    public double getVolume() {
        return height * super.getArea();
    }
}

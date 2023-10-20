package part2;

public class Pyramid extends Triangle implements Shape3D {
    int baseWidth;
    public Pyramid(int height,int baseLength,int baseWidth) {
        super(height, baseLength);
        this.baseWidth = baseWidth;
    }
    @Override
    public double getArea() {
        int height = super.getHeight();
        int baseLength = super.getBaseLength();
        double height2 = Math.pow(height, 2);
        return baseLength * baseWidth+ baseLength * Math.sqrt(Math.pow(((double)baseWidth)/2 , 2) + height2)+ baseWidth * Math.sqrt(Math.pow(((double)baseLength)/2, 2) + height2);
    }

    @Override
    public double getVolume() {
        int height = super.getHeight();
        int baseLength = super.getBaseLength();
        return ((double)(height* baseLength * height)) / 3;
    }
}

package part2;

public class Sphere extends Circle implements Shape3D{
    public Sphere(int radio){
        super(radio);
    }

    @Override
    public double getArea() {
        return 4 * super.getArea();
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(getRadio(),3);
    }

}

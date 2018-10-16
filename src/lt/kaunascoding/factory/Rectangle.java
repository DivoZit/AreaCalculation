package lt.kaunascoding.factory;

public class Rectangle implements Shape {
    private float width;
    private float height;

    public Rectangle(float parWidth, float parHeight) {
        height = parHeight;
        width = parWidth;

    }

    @Override
    public float draw() {
        float result = (width * height);
        System.out.println("Rectangle: " + result);
        return result;
    }
}

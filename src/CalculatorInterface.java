public interface CalculatorInterface {
    public double getArea(Rectangle r);
}

class Calculator implements CalculatorInterface {
    Rectangle rectangle;

    @Override
    public double getArea(Rectangle r) {
        this.rectangle = r;
        return rectangle.length * rectangle.width;
    }
}

public class CalculatorAdaptor implements CalculatorInterface {
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdaptor(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();

        Rectangle rectangle = new Rectangle();
        rectangle.width = triangle.base;
        rectangle.length = 0.5 * triangle.height;

        return calculator.getArea(rectangle);

    }
}

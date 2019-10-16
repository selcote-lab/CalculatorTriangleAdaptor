public class Client {
    public static void main(String[] args) {

        System.out.println(" *** Adapter Pattern Demo *** ");
        Triangle t = new Triangle(20, 20);

        CalculatorInterface calculatorAdaptor = new CalculatorAdaptor(t);
        double area = calculatorAdaptor.getArea(null);

        System.out.println("The area is : " + area);
    }
}

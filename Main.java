public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        Calculator calculator = new ComplexCalculator(logger);

        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(1, 2);

        ComplexNumber sum = calculator.add(a, b);
        System.out.println("Сумма: " + sum);

        ComplexNumber product = calculator.multiply(a, b);
        System.out.println("Произведение: " + product);

        ComplexNumber quotient = calculator.divide(a, b);
        System.out.println("Частное: " + quotient);
    }
    
}

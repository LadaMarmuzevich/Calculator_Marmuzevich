public class ComplexCalculator implements Calculator {
    private final Logger logger;
    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }
    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        logger.log("Выполнено сложение: " + a + " + " + b);
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        logger.log("Выполнено умножение: " + a + " * " + b);
        return new ComplexNumber(a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary(),
                a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal());
    }
    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        logger.log("Выполнено деление: " + a + " / " + b);
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        return new ComplexNumber((a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator,
                (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator);
    }
    
}

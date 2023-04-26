public class Dividir {
    public static int dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }

        if (dividendo < 0) {
            throw new ArithmeticException("Dividendo menor que zero!");
        }

        return dividendo / divisor;
    }
}

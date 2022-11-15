package AOP;

public class RecursiveCalculator implements Calculator {
    @Override
    public long factorial(final long num) { // why? final ?
        if (num == 0) {
            return 1;
        }
        return num * factorial(num -1);
    }
}

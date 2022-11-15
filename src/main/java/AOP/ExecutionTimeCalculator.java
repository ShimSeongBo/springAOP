package AOP;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExecutionTimeCalculator implements Calculator {

    private Calculator delegate;

    public ExecutionTimeCalculator(Calculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public long factorial(long num) {
        long start = System.nanoTime();
        long result = delegate.factorial(num);
        long end = System.nanoTime();
        System.out.printf(delegate.getClass().getSimpleName(), num, end-start);

        return result;
    }
}

package AOP;

import org.springframework.stereotype.Component;

@Component //빈으로 등록
public class BasicCalculator implements Calculator{


    @Override
    public long factorial(long num) {
            long result = 1;
            for (long i = 1; i <= num; i++) {
                result *= i;
        }
            return result;
    }
}

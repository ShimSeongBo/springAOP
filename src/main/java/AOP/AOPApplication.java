package AOP;

public class AOPApplication {
    public static void main(String[] args) {
//        BasicCalculator basicCalculator = new BasicCalculator();
//        RecursiveCalculator recursiveCalculator = new RecursiveCalculator();

//        long basicStart = System.currentTimeMillis();
//        basicCalculator.factorial(100);
//        long basicEnd = System.currentTimeMillis();
//        System.out.println(basicEnd - basicStart);
//
//        long recursStart = System.currentTimeMillis();
//        recursiveCalculator.factorial(100);
//        long recursEnd = System.currentTimeMillis();
//        System.out.println(recursEnd - recursStart);

        Calculator proxy1 = new ExecutionTimeCalculator(new BasicCalculator());
        System.out.println(proxy1.factorial(20));

        Calculator proxy2 = new ExecutionTimeCalculator(new RecursiveCalculator());
        System.out.println(proxy2.factorial(20));

    }
}

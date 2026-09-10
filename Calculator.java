public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(double a, double b) {
        return (int)(a + b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum =calculator.add(5, 10);
        System.out.println("Addition of two integers: " + sum);

        int sum3 = calculator.add(5, 10, 15);
        System.out.println("Addition of three integers: " + sum3);

        int sumD = calculator.add(5.5, 10.2);
        System.out.println("Addition of two doubles: " + sumD);

    }
}

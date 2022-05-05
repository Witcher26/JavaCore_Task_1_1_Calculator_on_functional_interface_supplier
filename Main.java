
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
//        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.multiply.apply(a, b);
        int pow = calc.pow.apply(c);
        int abs = calc.abs.apply(100);

        int d = calc.divide.apply(2, 0);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(pow);
        calc.println.accept(abs);
        System.out.println("\"Is value boolean\": " + calc.isPositive.test(abs));
    }
}

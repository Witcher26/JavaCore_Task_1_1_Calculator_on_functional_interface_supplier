
/*
Описание
Создайте класс Calculator. В нем создайте статическую переменную типа Supplier. Это функциональный интерфейс,
реализующий метод get(). С помощью данной переменной можно будет получить экземпляр класса Calculator.
Реализуйте ссылку на вызов конструктора класса Calculator() { }.

static Supplier<Calculator> instance = Calculator::new;
Далее добавьте несколько переменных типа BinaryOperator для математических операций над двумя числами.
Типизируйте их как Integer:

BinaryOperator<Integer> plus = (x, y) -> x + y;
BinaryOperator<Integer> minus = (x, y) -> x - y;
BinaryOperator<Integer> multiply = (x, y) -> x * y;
BinaryOperator<Integer> devide = (x, y) -> x / y;
Добавьте несколько переменных типа UnaryOperator для произведения математических операций над одним числом:

UnaryOperator<Integer> pow = x -> x * x;
UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
Добавьте переменную типа Predicate для определения положительное ли число:

Predicate<Integer> isPositive = x -> x > 0;
Добавьте переменную типа Consumer для вывода числа в консоль. Используйте для этого ссылку на статический метод println():

Consumer<Integer> println = System.out::println;
 */

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

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

import java.util.function.*;

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
public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> divide = (x, y) -> {
        int result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException ex) {
            String err = (char) 27 + "[31m";
            System.out.println("-------------");
            System.out.println(err + ex.getMessage());
        }
        return result;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}

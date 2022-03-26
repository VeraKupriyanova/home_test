public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b);

        //calc.println.accept(c);
        // ошибка - деление на 0 (переменная b=0, c= 3/0), исключение ArithmeticException
        // решение -переменную devide  можно написать другим способом используя тернарный оператор
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Внимание!!! Деление на 0! На ноль делить нельзя");
        }
    }
}

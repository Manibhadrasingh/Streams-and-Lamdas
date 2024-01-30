public class Operate {
    public static void main(String[] args) {
        MathmeticalOperation add = (x,y) -> x+y;
        int addition  = add.operate(5,6);
        System.out.println(addition);

        MathmeticalOperation sub = (x,y) -> x - y;
        int subtract = sub.operate(10, 4);
        System.out.println(subtract);

        MathmeticalOperation mul = (x,y) -> x * y;
        int multiply = mul.operate(10, 4);
        System.out.println(multiply);

        MathmeticalOperation div = (x,y) -> x / y;
        int divide = div.operate(10, 4);
        System.out.println(divide);
    }
}

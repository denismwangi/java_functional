package functioninterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increament  = increamentByOne(1);
        System.out.println(increament);

        int increament2 = integerIntegerFunction.apply(1);
        System.out.println(increament2);

    }

    static Function<Integer, Integer> integerIntegerFunction = number -> number+1;

    //normal functions
    static int increamentByOne(int number){
        return number+1;
    }
}

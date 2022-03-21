package functioninterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int increament  = increamentByOne(1);
        System.out.println(increament);

        int increament2 = integerIntegerFunction.apply(1);
        System.out.println(increament2);

        //combining two functions
        Function<Integer, Integer> addOneAndMultiplyBy10 = integerIntegerFunction
                .andThen(multiplyBy10Function);
        int chainFuntion = addOneAndMultiplyBy10.apply(1);
        System.out.println(chainFuntion);


    }

    static Function<Integer, Integer> integerIntegerFunction = number -> number+1;
    static Function<? super Integer, Integer> multiplyBy10Function = number -> number * 10;


    //normal functions
    static int increamentByOne(int number){
        return number+1;
    }
}

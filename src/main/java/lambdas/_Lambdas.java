package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Lambdas {

    public static void main(String[] args) {
        Function<String, String> convertUpper = name -> name.toUpperCase();

        Function<String, String> convertupper2 = name ->{
            if (name.isBlank())
                throw new IllegalStateException("no name");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> bif = (name, age) -> {
            if (name.isBlank()) {
                System.out.println(age);
                throw new IllegalStateException("no name");

            }
            return name.toUpperCase();
        };
            String upperCaseName = bif.apply("mark",10);
            System.out.println(upperCaseName);



    }
}

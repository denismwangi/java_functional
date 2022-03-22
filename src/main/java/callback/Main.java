package callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
       // printResult("John", "mark", null);
        printResult("jonh", null, value ->{
            System.out.println("no last name provide" +value);
        });

    }

    public static void printResult(String firstName, String lastName, Consumer<String> callback){
        if (lastName != null){
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }
    }
}

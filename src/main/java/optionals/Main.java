package optionals;


import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("username")
                .orElseGet(() -> "guest");
        System.out.println(value);

        Object val2 = Optional.ofNullable(null)
                .orElseThrow(()-> new IllegalStateException("email already taken"));
        System.out.println(val2);
    }
}

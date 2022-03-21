package functioninterface;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getConnection());
        System.out.println(getDbConnectionSupplier.get());

    }
    static String getConnection(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDbConnectionSupplier = () ->
            "jdbc://localhost:5432/users";
}

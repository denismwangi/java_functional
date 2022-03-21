package functioninterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("0712345678"));
        System.out.println(isPhoneNumberValid("07987654323456789"));

        //predicate
        System.out.println(isPhoneNumberValid2.test("0712345678"));
        System.out.println(isPhoneNumberValid2.test("07987654323456789"));
        System.out.println(
                "isPhoneNumberValid2" +isPhoneNumberValid2.and(containsNumber3).test("0712345678"));

    }

    static boolean isPhoneNumberValid(String phone){
        return phone.startsWith("07") && phone.length() == 10;
    }
    //predicate
    static Predicate<String> isPhoneNumberValid2 = phone -> phone.startsWith("07") && phone.length() == 10;

    static Predicate<String> containsNumber3 = phone -> phone.contains("3");
}

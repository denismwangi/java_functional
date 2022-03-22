package combinatorpattern;

public class CustomerValidatoService {

    public Boolean isEmailValid(String email){
        return email.contains("@");

    }
    public Boolean isPhoneVaid(String phone){
        return phone.startsWith("07") || phone.startsWith("+254");
    }

    public Boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail()) && isPhoneVaid(customer.getPhone());

    }
}

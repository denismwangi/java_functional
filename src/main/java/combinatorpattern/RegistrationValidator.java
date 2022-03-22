package combinatorpattern;

import java.util.function.Function;

import static combinatorpattern.RegistrationValidator.*;
import static combinatorpattern.RegistrationValidator.validationResult.*;

public interface RegistrationValidator extends Function<Customer, validationResult> {

    static RegistrationValidator isPhoneValid(){
        return customer -> customer.getPhone().startsWith("07") && customer.getPhone().startsWith("+254") ? SUCCESS : PHONE_NOT_VALID;
    }

    static RegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    default RegistrationValidator and (RegistrationValidator other){
        return customer -> {
            validationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result ;
        };
    }

    enum validationResult{
        SUCCESS,
        PHONE_NOT_VALID,
        EMAIL_NOT_VALID

    }
}

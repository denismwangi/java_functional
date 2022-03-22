package combinatorpattern;

import static combinatorpattern.RegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice","alice@d.com","09876544");

        CustomerValidatoService validatorService = new CustomerValidatoService();
       // System.out.println(validatorService.isValid(customer));

        //using combinator pattern
        validationResult result =  isEmailValid()
                .and(isPhoneValid())
                .apply(customer);
        System.out.println(result);
        if (result != validationResult.SUCCESS){
          //  throw new IllegalStateException(result.name());
        }
    }


}

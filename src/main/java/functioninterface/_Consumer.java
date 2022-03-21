package functioninterface;



import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //normal function
        Customer visitor = new Customer("Mark", "+76543456789");
        greetCustomer(visitor);
        greetCustomerv2(visitor, true);

        //functional approach
        greatCustomerConsumer.accept(visitor);
        greetCuctomerConsumerV2.accept(visitor, false);
    }

    static void greetCustomer(Customer customer){

        System.out.println("Thanks" +customer.name+ "for registering your phone is" +customer.phone );
    }
    static void greetCustomerv2(Customer customer, Boolean showPhone) {
        System.out.println("Thanks" +customer.name+ "for registering your phone is" +(showPhone ? customer.phone : "*******" ));

    }


    static class Customer {
        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }

        //using functional interface
    private static Consumer<Customer> greatCustomerConsumer = customer ->
                System.out.println("Thanks" +customer.name+ "for registering your phone is" +customer.phone );
    private static BiConsumer<Customer, Boolean> greetCuctomerConsumerV2 = (customer, showPhone) ->
            System.out.println("Thanks" +customer.name+ "for registering your phone is" +(showPhone ? customer.phone : "*********"));





}

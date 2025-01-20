package factory;

public class ProgramFactory {

    public static void main(String[] args) {
        Customer customer = new Customer("A", false);
        Factory factory = chooseFactory(customer);
        factory.createCar(customer.getTypeRequest());
    }

    private static Factory chooseFactory(Customer customer) {
        if (customer.returnCompanyContract()) {
            return new ContractsFactory();
        } else {
            return new WithoutConFactory();
        }
    }
}

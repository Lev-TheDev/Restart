package factory;

public class Customer {

    private String typeRequest;
    private boolean hasCompanyContract;

    public Customer(String typeRequest, boolean hasCompanyContract) {
        this.typeRequest = typeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public boolean returnCompanyContract() {
        return hasCompanyContract;
    }

    public String getTypeRequest() {
        return typeRequest;
    }
}

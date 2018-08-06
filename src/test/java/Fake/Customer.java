package Fake;

public class Customer {
    private String phoneNumber;
    private String address;

    public Customer(String phoneNumber, String address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNubmer() {
        return phoneNumber;
    }
}

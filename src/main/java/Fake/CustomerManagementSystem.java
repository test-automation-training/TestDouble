package Fake;

public class CustomerManagementSystem {
    String getContactInformationOf(int customeerId) throws Exception {
        String phoneNumber = getPhoneNumber(customeerId);
        String address = getAddress(customeerId);

        return "Phone Number: " + phoneNumber + "\n"
                + "Address: " + address;
    }

    protected String getAddress(int customerId) throws Exception {
        throw new Exception("Cannot search in Database");
    }

    protected String getPhoneNumber(int customerId) throws Exception {
        throw new Exception("Cannot search in Database");
    }
}

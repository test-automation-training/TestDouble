package Fake;

import java.util.Map;

public class FakeCustomerManagementSystem extends CustomerManagementSystem {
    private Map<Integer, Customer> customerMap;

    FakeCustomerManagementSystem(Map<Integer, Customer> customerMap) {
        this.customerMap = customerMap;
    }

    @Override
    protected String getAddress(int customerId) {
        return customerMap.get(customerId).getAddress();
    }

    @Override
    protected String getPhoneNumber(int customerId) {
        return customerMap.get(customerId).getPhoneNubmer();
    }
}

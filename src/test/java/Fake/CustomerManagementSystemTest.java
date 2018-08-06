package Fake;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerManagementSystemTest {

    @Test
    void should_get_customer_phone_number_successfully() throws Exception {
        Map<Integer, Customer> customerMap = new HashMap<>();
        Customer customer1 = new Customer("+86 123456789", "Customer 1 Address");
        Customer customer2 = new Customer("+86 987654321", "Customer 2 Address");
        customerMap.put(1, customer1);
        customerMap.put(2, customer2);

        CustomerManagementSystem system = new FakeCustomerManagementSystem(customerMap);

        String customer1ContactInformation = system.getContactInformationOf(1);
        assertThat(customer1ContactInformation)
                .isEqualTo("Phone Number: +86 123456789\n" +
                           "Address: Customer 1 Address");

        String customer2ContactInformation = system.getContactInformationOf(2);
        assertThat(customer2ContactInformation)
                .isEqualTo("Phone Number: +86 987654321\n" +
                           "Address: Customer 2 Address");
    }

    /*
    * 注意：这里实现了 Fake，在 Fake 中，可以使用例如用 Map（或从存储测试数据的文件中读取数据） 查找代替数据库查找的方式，这样有效的
    *      隔离了数据库查询，同时也可以测试到数据查询后的逻辑，当然，我们也同样可以使用 Stub 的方式直接模拟返回值。
    *      在这里实现的是一个用户管理系统，在这个系统中有一个根据用户 Id 获取通讯信息的方法，在其中有两处需要从数据库中查询（注意，在这里
    *      只是模拟会有两个连接数据库查询的方式，实际写代码中不会这样写）那么可以通过 Fake 的方式把两个查询都变成从 Map 中获取。
    * */
}
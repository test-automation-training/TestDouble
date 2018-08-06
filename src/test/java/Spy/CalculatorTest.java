package Spy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    @Test
    void should_return_correct_input_value_and_call_times_and_result() {
        SpyCalculator calculator = new SpyCalculator();
        int firstAddResult = calculator.add(2, 2, 2);
        int secondAddResult = calculator.add(3, 4);
        int finalResult = calculator.add(firstAddResult, secondAddResult);

        assertThat(firstAddResult).isEqualTo(6);
        assertThat(secondAddResult).isEqualTo(7);
        assertThat(finalResult).isEqualTo(13);
        assertThat(calculator.callTimes()).isEqualTo(3);
        assertThat(calculator.getCallList().get(0).getParameters()).isEqualTo(new int[]{2, 2, 2});
        assertThat(calculator.getCallList().get(1).getParameters()).isEqualTo(new int[]{3, 4});
        assertThat(calculator.getCallList().get(2).getParameters()).isEqualTo(new int[]{6, 7});
    }

    /*
    * 注意：本示例中，手动实现了 Spy 的部分工作原理，比如，记录传入参数，记录调用次数等。
    *      在真实的 Spy 实现中，会有更复杂的实现方式。
    *      例子中给出的是：一个计算器的加法实现。
    *      在本例中，想要做到的是，可以记录 Add 方法被调用的次数和传入的参数。在本例中有一个 Call 类，这里记录的是每次调用的参数，
    *      通过对于 CallList 的大小来确定被调用的次数。
    * */
}
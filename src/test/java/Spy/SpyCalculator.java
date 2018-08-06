package Spy;

import java.util.ArrayList;
import java.util.List;

public class SpyCalculator extends Calculator {
    private List<Call> callList = new ArrayList<>();

    @Override
    public int add(int... inputs) {
        log(inputs);
        return super.add(inputs);
    }

    public int callTimes(){
        return callList.size();
    }

    public List<Call> getCallList(){
        return callList;
    }

    private void log(int... inputs) {
        callList.add(new Call(inputs));
    }
}

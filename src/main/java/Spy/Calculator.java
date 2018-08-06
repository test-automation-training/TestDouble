package Spy;

public class Calculator {
    public int add(int... inputs){
        int result = 0;

        for(int input : inputs){
            result += input;
        }

        return result;
    }
}

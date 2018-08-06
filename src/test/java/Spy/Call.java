package Spy;

public class Call {
    private int[] inputs;

    public Call(int... inputs) {
        this.inputs = inputs;
    }

    public int[] getParameters() {
        return inputs;
    }
}

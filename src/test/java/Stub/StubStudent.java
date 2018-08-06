package Stub;

public class StubStudent extends Student {
    private int score;

    public StubStudent(int score) {
        this.score = score;
    }

    @Override
    public int getCET4TotalScore() throws Exception {
        return score;
    }
}

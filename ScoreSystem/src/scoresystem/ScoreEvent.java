package scoresystem;

public class ScoreEvent {
    private final String score;

    public ScoreEvent(String score) {
        this.score = score;
    }

    public String getScore() {
        return score;
    }
}
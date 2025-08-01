package scoresystem;

public class ScoreSubscriber implements ScoreListener {
    @Override
    public void scoreChanged(ScoreEvent event) {
        System.out.println("live result: " + event.getScore());
    }
}
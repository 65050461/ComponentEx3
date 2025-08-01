package scoresystem;

import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private final List<ScoreListener> listeners = new ArrayList<>();

    public void addScoreListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeScoreListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScoreLine(String score) {
        ScoreEvent event = new ScoreEvent(score);
        for (ScoreListener listener : listeners) {
            listener.scoreChanged(event);
        }
    }
}
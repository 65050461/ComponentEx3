package scoresystem2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LiveScoreBean {
    private String scoreLine;
    private final PropertyChangeSupport support;

    public LiveScoreBean() {
        support = new PropertyChangeSupport(this);
    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String scoreLine) {
        String oldScore = this.scoreLine;
        this.scoreLine = scoreLine;
        support.firePropertyChange("scoreLine", oldScore, scoreLine);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
package scoresystem2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ScoreSubscriber implements PropertyChangeListener {
    private String name;

    public ScoreSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("scoreLine".equals(evt.getPropertyName())) {
            System.out.println("live result: " + evt.getNewValue());
        }
    }
}
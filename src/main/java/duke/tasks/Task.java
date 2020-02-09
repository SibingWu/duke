package duke.tasks;

import static duke.utils.Constants.YES_ICON;
import static duke.utils.Constants.NO_ICON;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? YES_ICON : NO_ICON); // return tick or X symbols
    }

    public String toString() {
        return String.format("[%s] %s", getStatusIcon(), description);
    }

    public void markAsDone() {
        isDone = true;
    }
}
package zelenov.patterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
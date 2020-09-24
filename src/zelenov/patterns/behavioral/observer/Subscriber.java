package zelenov.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Some changes in vacancies"+vacancies);
        System.out.println("\n===================================\n");
    }
}

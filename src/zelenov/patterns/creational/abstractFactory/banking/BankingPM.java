package zelenov.patterns.creational.abstractFactory.banking;

import zelenov.patterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manage banking project...");
    }
}

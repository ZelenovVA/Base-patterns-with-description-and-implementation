package zelenov.patterns.creational.abstractFactory.banking;

import zelenov.patterns.creational.abstractFactory.Developer;
import zelenov.patterns.creational.abstractFactory.ProjectManager;
import zelenov.patterns.creational.abstractFactory.ProjectTeamFactory;
import zelenov.patterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getManager() {
        return new BankingPM();
    }
}

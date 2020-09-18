package zelenov.patterns.creational.abstractFactory.website;

import zelenov.patterns.creational.abstractFactory.Developer;
import zelenov.patterns.creational.abstractFactory.ProjectManager;
import zelenov.patterns.creational.abstractFactory.ProjectTeamFactory;
import zelenov.patterns.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getManager() {
        return new WebsitePM();
    }
}

package zelenov.patterns.creational.abstractFactory.website;

import zelenov.patterns.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manage website project...");
    }
}

package zelenov.patterns.behavioral.visitor;

public class JuniorDeveloper implements Developer {
    @Override
    public void createProjectClass(ProjectClass projectClass) {
        System.out.println("Writing bad code");
    }

    @Override
    public void createDatabase(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void createTest(Test test) {
        System.out.println("Creating bad test...");
    }
}

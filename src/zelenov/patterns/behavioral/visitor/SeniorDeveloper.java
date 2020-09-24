package zelenov.patterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void createProjectClass(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior");
    }

    @Override
    public void createDatabase(Database database) {
        System.out.println("Fixing database");
    }

    @Override
    public void createTest(Test test) {
        System.out.println("Creating reliable datatest");
    }
}

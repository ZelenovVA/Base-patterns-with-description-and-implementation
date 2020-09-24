package zelenov.patterns.behavioral.visitor;

public interface Developer {
    void createProjectClass(ProjectClass projectClass);
    void createDatabase(Database database);
    void createTest(Test test);
}

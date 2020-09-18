package zelenov.patterns.creational.prototype;

public class versionControlRunner {
    public static void main(String[] args) {
        Project master=new Project(1, "SuperProject", "new SourceCode()");
        Projectfactory projectfactory=new Projectfactory(master);
        Project cloneProject=projectfactory.cloneProject();
    }

}

package zelenov.patterns.creational.prototype;

public class Projectfactory {
    Project project;

    public void setProject(Project project) {
        this.project = project;
    }

    public Projectfactory(Project project) {
        this.project = project;
    }

    Project cloneProject(){
        return (Project)project.copy();
    }
}

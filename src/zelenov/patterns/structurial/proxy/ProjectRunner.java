package zelenov.patterns.structurial.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project=new RealProject("http://fuckingProject.com");
        project.run();
    }
}

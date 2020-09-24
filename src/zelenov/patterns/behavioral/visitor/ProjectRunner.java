package zelenov.patterns.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project=new Project();
        Developer jun=new JuniorDeveloper();
        Developer sen=new SeniorDeveloper();

        System.out.println("junior in action");
        project.beWritten(jun);

        System.out.println("\n=======================\n");

        System.out.println("Senior in action");
        project.beWritten(sen);
    }
}

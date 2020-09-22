package zelenov.patterns.structurial.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer=new SeniorJavaDeveloper(new JavaDeveloper());
        Developer developer1=new JavaLeadDeveloper(developer);
        System.out.println(developer.makeJob());
        System.out.println(developer1.makeJob());
    }
}

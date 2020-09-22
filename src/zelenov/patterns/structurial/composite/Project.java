package zelenov.patterns.structurial.composite;

public class Project {
    public static void main(String[] args) {
        Team team=new Team();

        Developer developer1=new JavaDeveloper();
        Developer developer2=new JavaDeveloper();
        Developer developer3=new CppDeveloper();

        team.addDeveloper(developer1);
        team.addDeveloper(developer2);
        team.addDeveloper(developer3);

        team.createProject();
    }
}

package zelenov.patterns.structurial.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory=new DeveloperFactory();
        List<Developer> developers=new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Cpp"));
        developers.add(developerFactory.getDeveloperBySpeciality("Cpp"));
        developers.add(developerFactory.getDeveloperBySpeciality("Cpp"));
        developers.add(developerFactory.getDeveloperBySpeciality("Cpp"));
        developers.add(developerFactory.getDeveloperBySpeciality("Cpp"));

        developers.stream().forEach(developer -> developer.writeCode());
    }
}

package zelenov.patterns.creational.factoryMethod;

public class DeveloperFactory {
    public static Developer createDeveloper(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {return new JavaDeveloper();}
        else if (speciality.equalsIgnoreCase("Cpp")) {return new CppDeveloper();}
        else if (speciality.equalsIgnoreCase("php")) {return new PhpDeveloper();}
        else {throw new IllegalArgumentException(speciality+" is unknown");}
    }
}

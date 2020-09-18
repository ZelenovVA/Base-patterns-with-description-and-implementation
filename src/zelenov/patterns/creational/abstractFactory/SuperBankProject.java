package zelenov.patterns.creational.abstractFactory;

import zelenov.patterns.creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankProject {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory=new BankingTeamFactory();
        Developer developer=teamFactory.getDeveloper();
        Tester tester=teamFactory.getTester();
        ProjectManager manager=teamFactory.getManager();

        System.out.println("Banking system creating");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}

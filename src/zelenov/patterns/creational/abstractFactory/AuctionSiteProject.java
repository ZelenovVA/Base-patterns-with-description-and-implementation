package zelenov.patterns.creational.abstractFactory;

import zelenov.patterns.creational.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory=new WebsiteTeamFactory();
        Developer developer=teamFactory.getDeveloper();
        Tester tester=teamFactory.getTester();
        ProjectManager manager=teamFactory.getManager();

        System.out.println("Auction website creating");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}

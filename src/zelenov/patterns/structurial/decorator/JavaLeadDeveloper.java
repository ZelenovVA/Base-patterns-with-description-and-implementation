package zelenov.patterns.structurial.decorator;

public class JavaLeadDeveloper extends DeveloperDecorator {
    public JavaLeadDeveloper(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Lead send week report";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+" "+sendWeekReport();
    }
}

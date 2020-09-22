package zelenov.patterns.structurial.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Reviewing code";
    }

    @Override
    public String makeJob() {
       return super.makeJob()+" "+makeCodeReview();
    }
}

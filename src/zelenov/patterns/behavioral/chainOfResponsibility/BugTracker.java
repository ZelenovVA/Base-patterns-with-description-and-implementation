package zelenov.patterns.behavioral.chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier=new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier=new EmailNotifier(Priority.ROUTINE);
        Notifier SMSNotifier=new SimpleReportNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(SMSNotifier);

        reportNotifier.notifyManager("Everything it is OK", Priority.ROUTINE);
        reportNotifier.notifyManager("Something it is wrong!", Priority.IMPORTANT);
        reportNotifier.notifyManager("Huston, we have a trouble", Priority.ASAP);

    }
}

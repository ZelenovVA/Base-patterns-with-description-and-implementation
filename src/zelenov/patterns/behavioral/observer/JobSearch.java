package zelenov.patterns.behavioral;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site=new JavaDeveloperJobSite();
        site.vacancies.add("First java position");
        site.vacancies.add("Second java position");

        Observer firstSubscriber1=new Subscriber("Slava Zelenov");
        Observer firstSubscriber2=new Subscriber("Dima Fillipov");

        site.subscribers.add(firstSubscriber1);
        site.subscribers.add(firstSubscriber2);

        site.vacancies.add("Third java position");

    }
}

package zelenov.patterns.behavioral.iterator;

public class JavaDeveloperRunner {

    public static void main(String[] args) {
        String[] skills={"Java", "Spring", "Hibernate", "Maven", "PostrgreSQL"};

        JavaDeveloper javaDeveloper=new JavaDeveloper( "Viacheslav Zelenov", skills);

        Iterator iterator=javaDeveloper.getIterator();
        System.out.println("Developer: "+javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString()+" ");
        }
    }


}

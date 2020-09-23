package zelenov.patterns.behavioral.memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;
     public void setVersionAndDate(String version){
         this.version=version;
         date=new Date();
     }

     public Save save(){
         return new Save(version);
     }

     public void load(){
         version=save().getVersion();
         date=save().getDate();
     }

    @Override
    public String toString() {
        return "Project:\n" +
                "\nVersion='" + version +
                "\nDate=" + date + "\n";
    }
}

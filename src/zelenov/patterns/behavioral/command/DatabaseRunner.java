package zelenov.patterns.behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database=new Database();
        Developer developer=new Developer(new UpdateCommand(database), new SelectCommand(database), new InsertCommand(database),
                new DeleteCommand(database));
        developer.deleteRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.insertRecord();
    }
}

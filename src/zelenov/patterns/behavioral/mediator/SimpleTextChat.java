package zelenov.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    private Admin admin;
    List<User> users=new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

        public void addUserToChat(User user){
        this.users.add(user);
        }
    @Override
    public void sendMessage(String message, User user) {
        users.stream().forEach(user1 -> {if (user1!=user){user1.getMessage(message);}});
        admin.getMessage(message);
    }
}

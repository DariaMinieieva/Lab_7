package MessageSender;

import User.User;

public class MessageSender {
    public String send(String text, User user, String country){
        return "User " + user.getEmail() + " from " + user.getCountry() + " got a text: \"" + text + "\"";
    }
}

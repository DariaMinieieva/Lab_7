package MessageSender;

import Facebook.FacebookUser;
import Twitter.TwitterUser;
import User.MyFacebookUser;
import User.MyTwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    Date date;
    Date date_2;
    TwitterUser usr;
    MessageSender snd;
    MyTwitterUser my_usr;

    FacebookUser f_usr;
    MyFacebookUser my_f_usr;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        date = new Date();
        usr = new TwitterUser("mail", "Ukraine", date);
        snd = new MessageSender();
        my_usr = new MyTwitterUser(usr);

        date_2 = new Date();
        f_usr = new FacebookUser("f_mail", "Italy", date_2);
        my_f_usr = new MyFacebookUser(f_usr);
    }


    @org.junit.jupiter.api.Test
    void send() {
        assertEquals("User mail from Ukraine got a text: \"Hello!\"", snd.send("Hello!", my_usr, "Ukraine"));
        assertEquals("User f_mail from Italy got a text: \"Hello, Italy!\"", snd.send("Hello, Italy!", my_f_usr, "Italy"));
    }
}
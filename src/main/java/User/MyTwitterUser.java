package User;

import Twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User {
    private TwitterUser t_user;

    public MyTwitterUser(TwitterUser t_user) {
        this.t_user = t_user;
    }

    @Override
    public String getEmail() {
        return t_user.getUserMail();
    }

    @Override
    public String getCountry() {
        return t_user.getCountry();
    }

    @Override
    public Date getActiveTime() {
        return t_user.getLastActiveTime();
    }
}

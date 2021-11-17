package User;

import Facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User {
    private FacebookUser f_user;

    public MyFacebookUser(FacebookUser f_user) {
        this.f_user = f_user;
    }

    @Override
    public String getEmail() {
        return f_user.getEmail();
    }

    @Override
    public String getCountry() {
        return f_user.getUserCountry();
    }

    @Override
    public Date getActiveTime() {
        return f_user.getUserActiveTime();
    }
}

package io.stackroute.nquireit.botservice.Model.DFDataModel.Post;

import java.util.List;

public class IntentPost {

    private String name;
    private boolean auto;
    private List<UserSays> userSays;

    public IntentPost() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public List<UserSays> getUserSays() {
        return userSays;
    }

    public void setUserSays(List<UserSays> userSays) {
        this.userSays = userSays;
    }
}

package SDK.Models;

import java.util.Date;

/**
 * Created by biancajuul-hansen on 17/11/2016.
 */

    public class AccessToken {

    private int id;
    private String token;
    private int userId;
    private User user;

    public AccessToken(int id, String token, int userId, User user) {
        this.id = id;
        this.token = token;
        this.userId = userId;
        this.user = user;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}





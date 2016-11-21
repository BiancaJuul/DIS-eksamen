package SDK.Models;

/**
 * Created by biancajuul-hansen on 16/11/2016.
 */

public class User {
    private String username;
    private String password;

    public User(String username) {
        this.username = username;
    }

    public User() {

    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setpassword(String password){
        this.password = password;
    }
}

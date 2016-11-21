package SDK.Services;

import SDK.Connection.Connection;
import SDK.Connection.ResponseCallback;
import SDK.Connection.ResponseParser;
import SDK.Models.AccessToken;
import SDK.Models.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * Created by biancajuul-hansen on 17/11/2016.
 */
public class UserService {


        private Connection connection;
        private Gson gson;

        public UserService(){
            this.connection = new Connection();
        this.gson = new Gson();
        }

        public void login(String username, String password, final ResponseCallback<AccessToken> responseCallback){

            HttpPost postRequest = new HttpPost(Connection.serverURL + "/staffs/login?include=user");

            User login = new User();
            login.setUsername(username);
            login.setpassword(password);

            try {
                StringEntity loginInfo = new StringEntity(this.gson.toJson(login));
                postRequest.setEntity(loginInfo);
                postRequest.setHeader("Content-Type", "application/json");

                this.connection.execute(postRequest, new ResponseParser() {
                    public void payload(String json) {
                        AccessToken accessToken = gson.fromJson(json, AccessToken.class);
                        AuthService.setAccessToken(accessToken);
                        responseCallback.success(accessToken);
                    }
                    public void error(int status) {
                        responseCallback.error(status);
                    }
                });


            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        public void getAll(final ResponseCallback<ArrayList<User>> responseCallback){
            HttpGet getRequest = new HttpGet(Connection.serverURL + "/staffs");

            this.connection.execute(getRequest, new ResponseParser() {
                public void payload(String json) {
                    ArrayList<User> books = gson.fromJson(json, new TypeToken<ArrayList<User>>() {
                    }.getType());
                    responseCallback.success(books);
                }

                public void error(int status) {
                    responseCallback.error(status);
                }
            });
        }

        public void findById(String id, final ResponseCallback<User> responseCallback){
            HttpGet getRequest = new HttpGet(Connection.serverURL = "/staffs/" + id);

            this.connection.execute(getRequest, new ResponseParser() {
                public void payload(String json) {
                    User user = gson.fromJson(json, User.class);
                    responseCallback.success(user);
                }

                public void error(int status) {
                    responseCallback.error(status);
                }
            });

        }

        public static void logOut(){
            AuthService.clear();
        }

        public static User current(){
            return AuthService.getAccessToken().getUser();
        }


    }

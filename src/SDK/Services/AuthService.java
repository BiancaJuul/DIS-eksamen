package SDK.Services;

import SDK.Models.AccessToken;

/**
 * Created by biancajuul-hansen on 17/11/2016.
 */
public class AuthService {
    private static AccessToken accessToken;

    public static void setAccessToken(AccessToken token){
        accessToken = token;
    }
    public static AccessToken getAccessToken(){
        return accessToken;
    }
    public static void clear(){
        accessToken = null;
    }
}

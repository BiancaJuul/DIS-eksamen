package SDK.Connection;

/**
 * Created by biancajuul-hansen on 16/11/2016.
 */
public interface ResponseParser {

        void payload(String json);
        void error (int status);

}

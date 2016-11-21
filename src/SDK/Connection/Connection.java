package SDK.Connection;

import SDK.Config;
import com.sun.deploy.net.HttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.omg.CORBA.portable.ResponseHandler;

import java.io.IOException;

/**
 * Created by biancajuul-hansen on 16/11/2016.
 */

public class Connection {

    public static String serverURL = Config.getDbUrl();
    private CloseableHttpClient httpClient;

    public Connection(){
        this.httpClient = HttpClients.createDefault();
    }


    //her man laver kaldet over til serveren
    public void execute(HttpUriRequest uriRequest, final ResponseParser parser){

        // Create a custom response handler
        org.apache.http.client.ResponseHandler<String> responseHandler = new org.apache.http.client.ResponseHandler<String>() {

            public String handleResponse(final org.apache.http.HttpResponse response) throws IOException {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    parser.error(status);
                }
                return null;
            }

        };

        try {
            String json = this.httpClient.execute(uriRequest, responseHandler);
            parser.payload(json);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
package SDK.Connection;

/**
 * Created by biancajuul-hansen on 16/11/2016.
 */
public interface ResponseCallback<T> {
    void success (T data);
    void error (int status);

}

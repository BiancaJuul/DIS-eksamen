package SDK;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by biancajuul-hansen on 17/11/2016.
 */
public class Config {


    public JsonObject initConfig() {


        JsonObject json = new JsonObject();

        try {
            JsonParser parserJ = new JsonParser();
            json = (JsonObject) parserJ.parse(new FileReader("src/SDK/config.json"));


        } catch (Exception e) {
            e.printStackTrace();

        }

        return json;
    }

    private static String DbUrl;

    public static String getDbUrl() {
        return DbUrl;
    }

    public static void setDbUrl(String dbUrl) {
        DbUrl = dbUrl;
    }

}

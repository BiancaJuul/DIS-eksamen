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

        // Gson gson = new Gson();
  /*      BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("/config.json")));
        ConfigMap config = gson.fromJson(br, ConfigMap.class);



*/

        JsonObject json = new FileReader("/src/config.json");

        try {
            JsonParser parserJ = new JsonObject();
            json = (JsonObject) parserJ.parse(new )

            while (line != null) {
                sb.append(line);
        //        sb.append(System.lineSeparator());
                line = br.readLine();
            }
            ConfigMap config = gson.fromJson(br, ConfigMap.class);
            Config.setDbUrl(config.getDbUrl());

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            br.close();
        }

        return null;
    }
    private static String dbUrl;

    public static String getDbUrl() {
        return dbUrl;
    }

    public static void setDbUrl(String dbUrl) {
        Config.dbUrl = dbUrl;
    }

}

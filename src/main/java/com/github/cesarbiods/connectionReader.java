package com.github.cesarbiods;
/**
 * Created by cesar on 2/2/17.
 */

import java.net.*;
import java.io.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class connectionReader {

    public static void main(String[] args) {

        Pokemon test = new Pokemon("pikachu", "electric", 34, 42);
        Hashmap hash = new Hashmap();
        hash.add("42", test);
        if (hash.contains("42")) {
            System.out.println("Success!");
        }
        hash.remove("42");
        if (!hash.contains("42")) {
            System.out.println("Success!");
        }

        String output  = getUrlContents("https://www.ncdc.noaa.gov/cdo-web/api/v2/locations");
            JsonParser parser = new JsonParser();
            JsonObject json = parser.parse(output).getAsJsonObject();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String prettyOutput = gson.toJson(json);
            System.out.println(prettyOutput);
        }

    private static String getUrlContents(String theUrl) {
        StringBuilder content = new StringBuilder();

        try {
            URL url = new URL(theUrl);

            URLConnection urlConnection = url.openConnection();
            String token = "tGlObizdVindugbTAYgLidfwnKENPDUA";
            urlConnection.setRequestProperty("Token", token);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}

package com.github.cesarbiods;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created by cesar on 2/20/17.
 */
public class Main {
    public static void main(String[] args) {

        Pokemon test = new Pokemon("pikachu", "electric", 34, 42);
        Pokemon test1 = new Pokemon("lucario", "steel/fighting", 74, 80);
        Hashmap hash = new Hashmap();
        hash.add("42", test);
        if (hash.contains("42")) {
            System.out.println("Success!");
        }
        System.out.println(hash.get("42").getName());
        hash.add("44", test1);
//        String[] keys = hash.keys().clone();
//        for (int i = 0; i < keys.length; i++) {
//            System.out.println(keys[i]);
//        }
        hash.remove("42");
        if (!hash.contains("42")) {
            System.out.println("Success!");
        }

        connectionReader cr = new connectionReader();
        String output  = cr.getUrlContents("https://pokeapi.co/api/v2/pokemon/1/");
        JsonParser parser = new JsonParser();
        JsonObject json = parser.parse(output).getAsJsonObject();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyOutput = gson.toJson(json);
        System.out.println(prettyOutput);
    }
}

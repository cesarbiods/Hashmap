package com.github.cesarbiods;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by cesar on 2/20/17.
 */
public class Main {
    public static void main(String[] args) {

//        Pokemon test = new Pokemon("pikachu", "electric", 34, 42);
//        Pokemon test1 = new Pokemon("lucario", "steel/fighting", 74, 80);
//        Hashmap hash = new Hashmap();
//        hash.add("42", test);
//        if (hash.contains("42")) {
//            System.out.println("Success!");
//        }
//        System.out.println(hash.get("42").getName());
//        hash.add("44", test1);
////        String[] keys = hash.keys().clone();
////        for (int i = 0; i < keys.length; i++) {
////            System.out.println(keys[i]);
////        }
//        hash.remove("42");
//        if (!hash.contains("42")) {
//            System.out.println("Success!");
//        }

        connectionReader cr = new connectionReader();
        String output  = cr.getUrlContents("https://pokeapi.co/api/v2/pokemon/478/");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        JsonParser parser = new JsonParser();
//        JsonObject json = parser.parse(output).getAsJsonObject();
        Pokemon pika = gson.fromJson(output, Pokemon.class);
        System.out.println("\n\nPokemon Object\n\n" + pika.getName());
        System.out.println(pika.getWeight());
        System.out.println(pika.getHeight());
        List<ComplexType> ctl = pika.getTypes();
        for (ComplexType ct: ctl) {
            System.out.println(ct.getType().getName());
        }
//        String prettyOutput = gson.toJson(json);
//        System.out.println(prettyOutput);
    }
}

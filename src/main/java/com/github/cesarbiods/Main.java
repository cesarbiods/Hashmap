package com.github.cesarbiods;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by cesar on 2/20/17.
 */
public class Main {
    public static void main(String[] args) {

        Hashmap hashmap = new Hashmap();
        connectionReader cr = new connectionReader();
        String url = "https://pokeapi.co/api/v2/pokemon/";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (int i = 1; i <= 38; i++) {
            String purl = url.concat(Integer.toString(i));
            String output  = cr.getUrlContents(purl);
            Pokemon poke = gson.fromJson(output, Pokemon.class);
            System.out.println("\n\nPokemon Object\n\n" + "Name: " + poke.getName());
            System.out.println(poke.getWeight());
            System.out.println(poke.getHeight());
            List<ComplexType> ctl = poke.getTypes();
            for (ComplexType ct: ctl) {
                System.out.println(ct.getType().getName());
            }
            hashmap.add(Integer.toString(i), poke);
            if (hashmap.contains(Integer.toString(i))) {
                System.out.println("Added!");
            }
        }
    }
}

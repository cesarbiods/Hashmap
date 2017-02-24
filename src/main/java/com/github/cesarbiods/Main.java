package com.github.cesarbiods;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cesar on 2/20/17.
 */
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(()-> new GUI());
        Hashmap hashmap = new Hashmap();
        connectionReader cr = new connectionReader();
        String url = "https://pokeapi.co/api/v2/pokemon/";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("Loading the pokedex...");
        //String entry = kb.nextLine();

        for (int i = 1; i <= 9; i++) {
            String purl = url.concat(Integer.toString(i));
            String output  = cr.getUrlContents(purl);
            Pokemon poke = gson.fromJson(output, Pokemon.class);
            hashmap.add(Integer.toString(i), poke);
        }

        System.out.println("Success!");
//        System.out.println("Please enter a Pokemon's dex number: ");
//        Pokemon poke = hashmap.get(entry);
//        System.out.println("\n\nPokemon Object\n\n" + "Name: " + poke.getName());
//        System.out.println(poke.getWeight());
//        System.out.println(poke.getHeight());
//        List<ComplexType> ctl = poke.getTypes();
//        for (ComplexType ct: ctl) {
//            System.out.println(ct.getType().getName());
//        }


    }
}

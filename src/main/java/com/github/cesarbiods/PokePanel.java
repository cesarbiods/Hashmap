package com.github.cesarbiods;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cesar on 2/23/17.
 */
public class PokePanel extends JPanel{
    private JButton b;
    private JTextField t;
    private ActionListener a;
    private String entry;
    public PokePanel() {
        Hashmap hashmap = new Hashmap();
        connectionReader cr = new connectionReader();
        String url = "https://pokeapi.co/api/v2/pokemon/";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("Loading the pokedex...");

        for (int i = 1; i <= 3; i++) {
            String purl = url.concat(Integer.toString(i));
            String output  = cr.getUrlContents(purl);
            Pokemon poke = gson.fromJson(output, Pokemon.class);
            hashmap.add(Integer.toString(i), poke);
        }
        System.out.println("Success!");

        b = new JButton("Search");
        t = new JTextField(10);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(PokePanel.this,
                        "Pokemon: \n" + hashmap.get(t.getText()).getName() + hashmap.get(t.getText()).getHeight()
                + hashmap.get(t.getText()).getWeight() + hashmap.get(t.getText()).getTypes());
            }
        });
        add(b);
        add(t);
        t.setToolTipText("Please enter a dex number between 1-9");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new GUI());
    }
}

package com.github.cesarbiods;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by cesar on 2/23/17.
 */
public class PokePanel extends JPanel{
    private JButton b;
    public PokePanel() {
        b = new JButton("Search");
        add(b);

        b.addActionListener(e -> System.out.println("Hello"));
    }

//    public String getEntry() {
//
//    }
}

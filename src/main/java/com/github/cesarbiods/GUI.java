package com.github.cesarbiods;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cesar on 2/23/17.
 */
public class GUI {
    public GUI() {
        initUI();
    }

    private void initUI() {
        JFrame frame = new JFrame("Pokedex");
        frame.setMinimumSize(new Dimension(800, 500));
        frame.setPreferredSize(new Dimension(50, 40));
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new PokePanel());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

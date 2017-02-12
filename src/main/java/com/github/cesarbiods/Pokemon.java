package com.github.cesarbiods;

/**
 * Created by cesar on 2/8/17.
 */
public class Pokemon {
    private String name;
    private String type;
    private int height;
    private int weight;

    public Pokemon(String n, String t, int h, int w) {
        name = n;
        type = t;
        height = h;
        weight = w;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

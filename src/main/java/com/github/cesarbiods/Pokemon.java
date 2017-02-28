package com.github.cesarbiods;

import java.util.List;

/**
 * Created by cesar on 2/8/17.
 */

/**
 * This class describes a Pokemon object to be created from the Pokeapi
 * nd loaded on the Hashmap by dex numbers. Every Pokemon has a name,
 * height, weight, and a single or a dual type.
 */

public class Pokemon {
    private String name;
    public List<ComplexType> types;
    private int height;
    private int weight;

    public Pokemon(String n, List<ComplexType> t, int h, int w) {
        name = n;
        types = t;
        height = h;
        weight = w;
    }

    public String getName() {
        return name;
    }

    public String getTypes() {
        String type = "";
        for (ComplexType temp: types) {
            type += temp.getType().getName();
            type += "/";
        }
        String actual = type.substring(0, type.length() - 1);
        return actual;
    }

    public int getValue() {
        int value = 0;
        for (ComplexType temp: types) {
            value += temp.getType().value();
        }
        return value;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(List<ComplexType> type) {
        this.types = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Pokemon: \n" + "Name: " + name + "\n" + "Type: " + getTypes() + "\n" + "Height: " + height + "\n" + "Weight: " + weight;
    }

    public int compare(Pokemon b) {
        int wRatio = 1;
        int hRatio = 100;
        int tRatio = 10;
        int result = 0;
        result += ((this.getHeight() - b.getHeight()) * hRatio);
        result += ((this.getWeight() - b.getWeight()) * wRatio);
        result += ((this.getValue() - b.getValue()) * tRatio);
        return Math.abs(result);
    }
}

package com.github.cesarbiods;

import java.util.List;

/**
 * Created by cesar on 2/8/17.
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

    public List<ComplexType> getTypes() {
        return types;
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
}

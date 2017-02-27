package com.github.cesarbiods;

import java.text.Normalizer;

/**
 * Created by cesar on 2/22/17.
 */
enum Name {
    NORMAL, FIRE, ROCK, GROUND, GRASS, BUG, POISON, FIGHTING,
    DRAGON, DARK, GHOST, STEEL, ELECTRIC, FAIRY, PSYCHIC,
    FLYING, ICE, WATER
//        private int value;
//        public int getValue() {
//            return value;
//        }
}
public class Type {
    private String url;
    private Name name;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String toString() {
        String temp = "";
        switch (name) {
            case NORMAL:
                temp += "Normal/";
            case FIRE:
                temp += "Fire/";
            case ROCK:
                temp += "Rock/";
            case GROUND:
                temp += "Ground/";
            case GRASS:
                temp += "Grass/";
            case BUG:
                temp += "Bug/";
            case POISON:
                temp += "Poison/";
            case FIGHTING:
                temp += "Fighting/";
            case DRAGON:
                temp += "Dragon/";
            case DARK:
                temp += "Dark/";
            case GHOST:
                temp += "Ghost/";
            case STEEL:
                temp += "Steel/";
            case ELECTRIC:
                temp += "Electric/";
            case FAIRY:
                temp += "Fairy/";
            case PSYCHIC:
                temp += "Psychic/";
            case FLYING:
                temp += "Flying/";
            case ICE:
                temp += "Ice/";
            case WATER:
                temp += "Water/";
            break;
        }
        return temp;
    }
}

package com.github.cesarbiods;

/**
 * Created by cesar on 2/22/17.
 */
public class Type {
    private String url;
    public enum name {
        NORMAL, FIRE, ROCK, GROUND, GRASS, BUG, POISON, FIGHTING,
        DRAGON, DARK, GHOST, STEEL, ELECTRIC, FAIRY, PSYCHIC,
        FLYING, ICE, WATER;
        private int value;
        public int getValue() {
            return value;
        }
//        public void setValue(String name) {
//            value = name;
//        }
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

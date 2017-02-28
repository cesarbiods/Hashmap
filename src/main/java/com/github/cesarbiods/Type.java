package com.github.cesarbiods;

import java.text.Normalizer;

/**
 * Created by cesar on 2/22/17.
 */

public class Type {
    private String url;
    private String name;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int value() {
        switch (name) {
            case "normal":
                return 1;
            case "fire":
                return 2;
            case "rock":
                return 3;
            case "ground":
                return 4;
            case "grass":
                return 5;
            case "bug":
                return 6;
            case "poison":
                return 7;
            case "fighting":
                return 8;
            case "dragon":
                return 9;
            case "dark":
                return 10;
            case "ghost":
                return 11;
            case "steel":
                return 12;
            case "electric":
                return 13;
            case "fairy":
                return 14;
            case "psychic":
                return 15;
            case "flying":
                return 16;
            case "ice":
                return 17;
            case "water":
                return 18;
            default: return 0;
        }
    }
}

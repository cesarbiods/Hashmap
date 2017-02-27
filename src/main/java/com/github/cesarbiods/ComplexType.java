package com.github.cesarbiods;

import java.util.List;

/**
 * Created by cesar on 2/22/17.
 */
public class ComplexType {
    private int slot;
    private Type type;

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public Type getType() {
        return type;
    }
}

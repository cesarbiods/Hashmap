package com.github.cesarbiods;

/**
 * Created by cesar on 2/8/17.
 */
public class Hashmap {
    Entry[] tab = new Entry[16];
    static class Entry {
        final String key;
        Pokemon value;
        Entry next;
        int hash;

        Entry(String k, Pokemon v, Entry n, int h) {
            key = k;
            value = v;
            next = n;
            hash = h;
        }
    }

    public boolean contains(String key) {
        int h = key.hashCode();
        Entry[] j = tab;
        int i = h & (j.length - 1);
        for (Entry e = j[i]; e != null; e = e.next) {
            if (e.hash == h && key.equals(e.key)) {
                return true;
            }
        }
        return false;
    }

    public void remove(String key) {
        int h = key.hashCode();
        entry[] j = tab;
        int i = h & (j.length - 1);
        entry prev = null;
        node p = j[i];
        while (p != null) {
            if (p.hash == h && key.equals(p.key)) {
                if (prev == null) {
                    t[i] = p.next;
                } else {
                    prev.next = p.next;
                }
                return;
            }
            prev = p;
            p = next; //dunno this
        }
    }
}

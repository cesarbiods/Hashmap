package com.github.cesarbiods;

/**
 * Created by cesar on 2/8/17.
 */
public class Hashmap {
    Entry[] tab = new Entry[16];
    int count = 0;
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
        Entry[] t = tab;
        int i = h & (t.length - 1);
        for (Entry e = t[i]; e != null; e = e.next) {
            if (e.hash == h && key.equals(e.key)) {
                return true;
            }
        }
        return false;
    }

    public void add(String key, Pokemon poke) {
        int h = key.hashCode();
        Entry[] t = tab;
        int i = h & (tab.length) - 1;

        for (Entry e = t[i]; e != null; e = e.next) {
            if (e.hash == h && key.equals(e.key)) {
                e.value = poke;
                return;
            }
        }

        Entry p = new Entry(key, poke, t[i], h);
        t[i] = p;
        int n = t.length;
        int c = ++count;
        if (c/t.length < 0.75) {
            return;
        }

        int newN = n << 1;
        Entry [] newTab = new Entry[newN];

        for (int y = 0; y < n; y++) {
            Entry e;
            while ((e = t[i]) != null) {
                t[y] = e.next;
                int x = e.hash & (newN - 1);
                e.next = newTab[y];
                newTab[y] = e;
            }
            tab = newTab;
        }
    }

    public void remove(String key) {
        int h = key.hashCode();
        Entry[] t = tab;
        int i = h & (t.length - 1);
        Entry pred = null;
        Entry p = t[i];
        while (p != null) {
            if (p.hash == h && key.equals(p.key)) {
                if (pred == null) {
                    t[i] = p.next;
                } else {
                    pred.next = p.next;
                }
                --count;
                return;
            }
            pred = p;
            p = p.next;
        }
    }
}

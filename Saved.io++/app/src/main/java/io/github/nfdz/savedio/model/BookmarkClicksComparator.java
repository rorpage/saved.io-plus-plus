/*
 * Copyright (C) 2017 Noe Fernandez
 */
package io.github.nfdz.savedio.model;

import java.util.Comparator;

/**
 * Clicks comparator. The order is from more clicks to less.
 */
public class BookmarkClicksComparator implements Comparator<Bookmark> {
    @Override
    public int compare(Bookmark bookmark1, Bookmark bookmark2) {
        return bookmark2.getClickCounter() - bookmark1.getClickCounter();
    }
}

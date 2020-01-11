package com.moonface.mathbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic {
    String title;
    int iconDrawableID;
    List<Item> items;


    Topic(String title, int iconDrawableID, Item[] items){
        this.title = title;
        this.iconDrawableID = iconDrawableID;
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public Topic(String title, int iconDrawableID){
        this(title, iconDrawableID, null);
    }
}

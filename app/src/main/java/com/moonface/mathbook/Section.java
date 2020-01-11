package com.moonface.mathbook;

public class Section {
    public String title;
    public String description;
    public int iconDrawableID;
    public Topic[] topics;

    public Section(String title, String description, int iconDrawableID, Topic[] topics){
        this.title = title;
        this.description = description;
        this.iconDrawableID = iconDrawableID;
        this.topics = topics;
    }

    public Section(String title, String description, int iconDrawableID){
        this(title, description, iconDrawableID, null);
    }
}

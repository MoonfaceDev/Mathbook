package com.moonface.mathbook;

import android.view.ViewGroup;

public abstract class Item {
    int sizeX;
    int sizeY;
    public abstract int getCode();

    final static int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;
    final static int MATCH_PARENT = ViewGroup.LayoutParams.MATCH_PARENT;
}

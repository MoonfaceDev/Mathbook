package com.moonface.mathbook;

import android.graphics.Color;
import android.view.ViewGroup;

public class Divider extends Item {
    int color;

    public Divider(){
        this.sizeX = ViewGroup.LayoutParams.MATCH_PARENT;
        this.sizeY = 2;
        this.color = Color.rgb(189,189,189);
    }

    public Divider(int height, int color){
        this.sizeX = ViewGroup.LayoutParams.MATCH_PARENT;
        this.sizeY = height;
        this.color = color;
    }

    @Override
    public int getCode() {
        return 2;
    }
}

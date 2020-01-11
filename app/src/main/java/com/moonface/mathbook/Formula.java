package com.moonface.mathbook;

import android.view.ViewGroup;

public class Formula extends Item {
    String text;

    Formula(String text){
        this.text = text;
        this.sizeX = ViewGroup.LayoutParams.WRAP_CONTENT;
        this.sizeY = ViewGroup.LayoutParams.WRAP_CONTENT;
    }

    @Override
    public int getCode() {
        return 4;
    }
}

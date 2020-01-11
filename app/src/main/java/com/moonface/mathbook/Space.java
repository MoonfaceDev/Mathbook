package com.moonface.mathbook;

import android.view.ViewGroup;

public class Space extends Item {
    Space(int height){
        this.sizeY = height;
        this.sizeX = ViewGroup.LayoutParams.MATCH_PARENT;
    }

    @Override
    public int getCode() {
        return 3;
    }
}

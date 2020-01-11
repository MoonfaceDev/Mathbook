package com.moonface.mathbook;

public class Image extends Item {
    int drawableID;

    public Image(int drawableID, int sizeX, int sizeY){
        this.drawableID = drawableID;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    @Override
    public int getCode() {
        return 1;
    }
}

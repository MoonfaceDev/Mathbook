package com.moonface.mathbook;

import android.graphics.Color;
import android.view.ViewGroup;

public class Text extends Item {

    String text;
    int textSize;
    TextStyle textStyle;
    Alignment alignment;
    Direction direction;
    int textColor;

    public enum TextStyle {normal, bold, italic, underline}
    public enum Alignment {right, center, left}
    public enum Direction {ltr, rtl}

    Text(String text, int textColor, TextStyle textStyle, Alignment alignment, Direction direction) {
        this.text = text;
        this.sizeX = ViewGroup.LayoutParams.MATCH_PARENT;
        this.sizeY = ViewGroup.LayoutParams.WRAP_CONTENT;
        this.textSize = 14;
        this.textStyle = TextStyle.normal;
        this.textColor = textColor;
        this.alignment = alignment;
        this.direction = direction;
    }

    Text(String text){
        this(text, Color.BLACK, TextStyle.normal, Alignment.right, Direction.rtl);
    }

    Text setText(String text){
        this.text = text;
        return this;
    }

    Text setTextSize(int textSize){
        this.textSize = textSize;
        return this;
    }

    Text setTextStyle(TextStyle textStyle){
        this.textStyle = textStyle;
        return this;
    }

    Text setAlignment(Alignment alignment){
        this.alignment = alignment;
        return this;
    }

    Text setDirection(Direction direction){
        this.direction = direction;
        return this;
    }

    Text setTextColor(int textColor){
        this.textColor = textColor;
        return this;
    }

    @Override
    public int getCode() {
        return 0;
    }
}

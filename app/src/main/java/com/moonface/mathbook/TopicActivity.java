package com.moonface.mathbook;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import io.github.kexanie.library.MathView;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        setupToolbar();
        setupPage();
    }

    private void setupToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle(Data.sections[getIntent().getIntExtra("section",0)].topics[getIntent().getIntExtra("topic",0)].title);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private void setupPage() {
        LinearLayout parent = findViewById(R.id.page_view);
        for(Item i : Data.sections[getIntent().getIntExtra("section",0)].topics[getIntent().getIntExtra("topic",0)].items){
            switch(i.getCode()){
                case 0:
                    Text text = (Text)i;
                    TextView textView = new TextView(this);
                    textView.setText(text.text);
                    switch(text.textStyle) {
                        case normal:
                            textView.setTypeface(null, Typeface.NORMAL);
                            break;
                        case bold:
                            textView.setTypeface(null, Typeface.BOLD);
                            break;
                        case italic:
                            textView.setTypeface(null, Typeface.ITALIC);
                            break;
                        case underline:
                            SpannableString content = new SpannableString(text.text);
                            content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                            textView.setText(content);
                    }
                    switch (text.alignment){
                        case left:
                            textView.setGravity(Gravity.LEFT);
                            break;
                        case center:
                            textView.setGravity(Gravity.CENTER);
                            break;
                        case right:
                            textView.setGravity(Gravity.RIGHT);
                            break;
                    }
                    switch (text.direction){
                        case ltr:
                            textView.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
                            break;
                        case rtl:
                            textView.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
                            break;
                    }
                    textView.setTextSize(text.textSize);
                    textView.setLayoutParams(new LinearLayout.LayoutParams(text.sizeX, text.sizeY));
                    parent.addView(textView);
                    break;
                case 1:
                    Image image = (Image)i;
                    ImageView imageView = new ImageView(this);
                    imageView.setImageDrawable(getResources().getDrawable(image.drawableID));
                    imageView.setLayoutParams(new LinearLayout.LayoutParams(image.sizeX, image.sizeY));
                    parent.addView(imageView);
                    break;
                case 2:
                    Divider divider = (Divider)i;
                    View dividerView = new View(this);
                    dividerView.setBackgroundColor(divider.color);
                    dividerView.setLayoutParams(new LinearLayout.LayoutParams(divider.sizeX, divider.sizeY));
                    parent.addView(dividerView);
                    break;
                case 3:
                    Space space = (Space)i;
                    View spaceView = new View(this);
                    spaceView.setLayoutParams(new LinearLayout.LayoutParams(space.sizeX, space.sizeY));
                    parent.addView(spaceView);
                    break;
                case 4:
                    Formula formula = (Formula)i;
                    MathView mathView = new MathView(this, null);
                    mathView.setText(formula.text);
                    mathView.setEngine(MathView.Engine.KATEX);
                    mathView.setLayoutParams(new LinearLayout.LayoutParams(formula.sizeX, formula.sizeY));
                    parent.addView(mathView);
            }
        }
    }
}

package com.example.admin.customviewshomework;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.support.v7.widget.AppCompatButton;

/**
 * Created by Admin on 10/26/2017.
 */

public class CustomViewButton extends AppCompatButton {

    private String btnText = "";

     public CustomViewButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void initViews(Context context, AttributeSet attrs){
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.custom_button, 0, 0);

        try {
            // get the text and colors specified using the names in attrs.xml
            btnText = a.getString(R.styleable.custom_button_text);

        } finally {
            a.recycle();
        }
    }

    @Override
    public String getText() {
        return btnText;
    }

}

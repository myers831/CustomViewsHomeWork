package com.example.admin.customviewshomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    CustomLinearLayout customLinearLayout;
    CustomViewButton customViewButton;
    EditText etSetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSetText = findViewById(R.id.etSetText);

        customLinearLayout = findViewById(R.id.cllCustom);
        customViewButton = findViewById(R.id.btnCustom);
        customViewButton.setText("Press");
    }

    public void setText(View view) {
        customLinearLayout.setLeftLabel(etSetText.getText().toString());
        customLinearLayout.setRightLabel(customLinearLayout.getLeftLabel());
    }
}

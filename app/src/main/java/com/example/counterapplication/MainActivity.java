package com.example.counterapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView numericalDisplay;
    private Button addButton, subtractButton, resetButton;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout constraintLayout= findViewById(R.id.mainLayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        numericalDisplay = findViewById(R.id.numerical_display);
        addButton = findViewById(R.id.add_button);
        subtractButton = findViewById(R.id.subtract_button);
        resetButton = findViewById(R.id.reset_Button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAddButton();
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSubtractButton();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResetButton();
            }
        });
    }

    public void setAddButton() {
        count += 1;
        numericalDisplay.setText(String.valueOf(count));
    }

    public void setSubtractButton() {
        if (count != 0)
        count -= 1;
        numericalDisplay.setText(String.valueOf(count));
    }

    public void setResetButton() {
        count = 0;
        numericalDisplay.setText(String.valueOf(count));
    }
}
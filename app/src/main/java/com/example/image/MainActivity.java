package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper vf1;
    int image[] = {R.drawable.bettal,R.drawable.fall,R.drawable.gtav,R.drawable.rdr2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vf1 = findViewById(R.id.ViewFlip);

        for(int i=0;i<image.length;i++){
            ShowImage(image[i]);
        }
    }

    public void ShowImage(int i) {
        ImageView i1 = new ImageView(this);
        i1.setImageResource(i);
        vf1.addView(i1);
        vf1.setAutoStart(true);
        vf1.setFlipInterval(1500);
        vf1.setInAnimation(this, android.R.anim.slide_out_right);
        vf1.setInAnimation(this, android.R.anim.slide_in_left);
    }
}
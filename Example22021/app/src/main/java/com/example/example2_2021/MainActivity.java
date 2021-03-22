package com.example.example2_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonManager;
    TextView textViewManager;
    ImageView imageViewManager;
    Intent myIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonManager = findViewById(R.id.button);
        textViewManager = findViewById(R.id.textView);
        imageViewManager = findViewById(R.id.imageView);

        buttonManager.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textViewManager.setText("Clicked");
                if (imageViewManager.getVisibility()==View.VISIBLE){
                  imageViewManager.setVisibility(View.INVISIBLE);
              }
              else{
                  imageViewManager.setVisibility(View.VISIBLE);
              }
              myIntent = new Intent(MainActivity.this, ChildActivity.class);
              myIntent.putExtra("myExtra",textViewManager.getText().toString());
              startActivity(myIntent);
            }
        });
    }
}
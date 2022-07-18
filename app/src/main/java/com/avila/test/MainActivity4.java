package com.avila.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.storage.StorageReference;

public class MainActivity4 extends AppCompatActivity {
 ImageButton myImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main4);
        myImageButton=(ImageButton) findViewById(R.id.imageButton);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent();
                startActivity(intent4);
            }
        });

        myImageButton=(ImageButton) findViewById(R.id.imageButton2);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5= new Intent();
                startActivity(intent5);
            }
        });

        myImageButton=(ImageButton) findViewById(R.id.imageButton3);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6= new Intent();
                startActivity(intent6);
            }
        });

        myImageButton=(ImageButton) findViewById(R.id.imageButton3);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7= new Intent();
                startActivity(intent7);
            }
        });

        myImageButton=(ImageButton) findViewById(R.id.imageButton4);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8= new Intent();
                startActivity(intent8);
            }
        });

        myImageButton=(ImageButton) findViewById(R.id.imageButton5);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9= new Intent();
                startActivity(intent9);
            }
        });

        myImageButton=(ImageButton) findViewById(R.id.imageButton6);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10= new Intent();
                startActivity(intent10);
            }
        });
    }
}
package com.shilpasayura.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {
        GridView simpleGrid;
        int logos[] = {R.drawable.logo1, R.drawable.logo2, R.drawable.logo3,
                R.drawable.logo4, R.drawable.logo5, R.drawable.logo6,
                R.drawable.logo7, R.drawable.logo8, R.drawable.logo9
                };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView
            // Create an object of CustomAdapter and set Adapter to GirdView
            CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logos);
            simpleGrid.setAdapter(customAdapter);
            // implement setOnItemClickListener event on GridView
            simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    // set an Intent to Another Activity
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("image", logos[position]); // put image data in Intent
                    startActivity(intent); // start Intent
                }
            });
        }
    }

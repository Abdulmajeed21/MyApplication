package com.example.myapplication.activities.company;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class RestaurantPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_page);
    }

    public void ToTicketPage(View view){
        Button move;
        move = findViewById(R.id.button2);
        Intent intent = new Intent(this, TicketPageActivity.class);
        startActivity(intent);
    }
}
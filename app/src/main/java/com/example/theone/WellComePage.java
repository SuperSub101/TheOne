package com.example.theone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WellComePage extends AppCompatActivity {
    private Button busbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_well_come_page);

        busbtn = findViewById(R.id.busbtn);
        busbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WellComePage.this,BusRecView.class);
                startActivity(intent);

            }
        });
    }
}
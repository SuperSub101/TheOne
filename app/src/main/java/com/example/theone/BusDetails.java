package com.example.theone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusDetails extends AppCompatActivity {
private Button confirmseatbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_details);

        //Button btn = (Button) findViewById(R.id.button);
        Button confirmseatbtn = (Button) findViewById(R.id.seatbtn);

        confirmseatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BusDetails.this,Paymentact.class);
                startActivity(intent);
            }
        });

    }
}
package com.example.theone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Paymentact extends AppCompatActivity {

        RadioGroup radioGroup;
        RadioButton selectedRadioButton;
        Button getitoverwith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentact);

        getitoverwith = (Button) findViewById(R.id.getitoverwith) ;
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        getitoverwith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                String yourpick = selectedRadioButton.getText().toString();
                Toast.makeText(Paymentact.this, "Selected Option" + yourpick, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(view.getContext(),FinalPage.class);
                view.getContext().startActivity(intent);
            }
        });

    }
}
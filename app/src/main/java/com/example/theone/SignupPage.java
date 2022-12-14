package com.example.theone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupPage extends AppCompatActivity {
    private Button sgnbtn;
    private EditText name,email,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        name = findViewById(R.id.nameedt);
        email = findViewById(R.id.emailedt);
        number = findViewById(R.id.numedt);
        sgnbtn = findViewById(R.id.signconfirm);

        sgnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = name.getText().toString();
                String mail = email.getText().toString();
                String num = number.getText().toString();

                openActivity();

                //Rewrite the class for the confirmed order page edit it later

                Intent intent = new Intent(SignupPage.this, WellComePage.class);
                intent.putExtra("keyname", username);
                intent.putExtra("keyemail", mail);
                intent.putExtra("keynum", num);
                startActivity(intent);



            }
        });

    }
    public void openActivity()
    {
        Intent intent = new Intent(SignupPage.this,WellComePage.class);
        startActivity(intent);
    }
}

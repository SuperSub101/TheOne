package com.example.theone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class   LoginPage extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2;
    int counter = 3;
    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        b1 = (Button) findViewById(R.id.loginbtn2);
        b2 = (Button) findViewById(R.id.backbtn);
        ed1 = (EditText) findViewById(R.id.nametxt);
        ed2 = (EditText) findViewById(R.id.passwordtxt);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle b = new Bundle();


                if(ed1.getText().toString().equals("admin")&& ed2.getText().toString().equals("admin"))
                {
                    openWelcomepage();

                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_LONG).show();
                    counter--;
                    if(counter ==0){
                        //b1.setEnabled(false);
                        //finish();
                        System.exit(0);
                    }
                }

            }
        });
    }
    public void openWelcomepage()
    {
        Intent intent = new Intent(this,WellComePage.class);
        startActivity(intent);
    }
    public void openMainActivity()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
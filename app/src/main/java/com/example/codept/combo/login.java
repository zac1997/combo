package com.example.codept.combo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private static EditText user;
    private static EditText pass;
    private static Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }
    public void login()
    {
        user=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText3);

        b=(Button)findViewById(R.id.button3);
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(user.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
                        {
                            Toast.makeText(login.this,"correct",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(login.this,"BAIL galat haiiii",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}

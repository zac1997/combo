package com.example.codept.combo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private static Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button)findViewById(R.id.button);
        btn2 =(Button)findViewById(R.id.button2);


        login();
        registerr();


    }
    public void login()
    {

        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent i= new Intent("com.example.codept.combo.login");
                        startActivity(i);

                    }
                }
        );

    }
    public void registerr()
    {
        btn2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent i2=new Intent("com.example.codept.combo.registerr");
                        startActivity(i2);

                    }
                }
        );
    }
}

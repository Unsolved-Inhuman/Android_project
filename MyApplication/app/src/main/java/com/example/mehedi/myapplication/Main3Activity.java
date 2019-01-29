package com.example.mehedi.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        checkBox1 = (CheckBox) findViewById(R.id.ironMan);

        checkBox3 = (CheckBox) findViewById(R.id.spiderman);

        //okButton = (Button) findViewById(R.id.showButton);
        Handler handler = new Handler();
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkBox1.isChecked()){
                    Intent ironMan=new Intent(Main3Activity.this,Main4Activity.class);
                    startActivity(ironMan);
                }
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkBox3.isChecked()){
                    Intent spiderman_page=new Intent(Main3Activity.this,Main6Activity.class);
                    startActivity(spiderman_page);
                }
            }
        });
    }

}

package com.example.mehedi.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Main8Activity extends AppCompatActivity {
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        checkBox2 = (CheckBox) findViewById(R.id.hulk);
        checkBox4 = (CheckBox) findViewById(R.id.superman);

        Handler handler = new Handler();
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkBox2.isChecked()){
                    Intent superman_page=new Intent(Main8Activity.this,Main5Activity.class);
                    startActivity(superman_page);
                }
            }
        });
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkBox4.isChecked()){
                    Intent hulk_page=new Intent(Main8Activity.this,Main7Activity.class);
                    startActivity(hulk_page);
                }
            }
        });
    }
}

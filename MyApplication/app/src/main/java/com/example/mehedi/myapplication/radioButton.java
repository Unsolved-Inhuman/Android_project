package com.example.mehedi.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class radioButton extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton marvelOrDc;
    private Button button;
    private AlertDialog.Builder alertbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroupID);
        button=(Button)findViewById(R.id.radioButtonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId=radioGroup.getCheckedRadioButtonId();
                marvelOrDc=findViewById(radioId);
                if(marvelOrDc.getId()==R.id.buttonMarvel)
                {
                    alertbox=new AlertDialog.Builder(radioButton.this);
                    alertbox.setTitle(R.string.alertBoxTitle);
                    alertbox.setMessage(R.string.alertMessage);
                    alertbox.setIcon(R.drawable.warning);

                   alertbox.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent MarvelWindow = new Intent(radioButton.this, Main3Activity.class);
                                    startActivity(MarvelWindow);
                                }
                            });
                    alertbox.setNeutralButton("NO", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                     AlertDialog alertboxShow=alertbox.create();
                     alertboxShow.show();


                }
                else
                {
                    alertbox=new AlertDialog.Builder(radioButton.this);
                    alertbox.setTitle(R.string.alertBoxTitle);
                    alertbox.setMessage(R.string.alertMessage);
                    alertbox.setIcon(R.drawable.warning);

                    alertbox.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent DcWindow = new Intent(radioButton.this, Main8Activity.class);
                            startActivity(DcWindow);
                        }
                    });
                    alertbox.setNeutralButton("NO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    AlertDialog alertboxShow=alertbox.create();
                    alertboxShow.show();



                }
            }
        });

    }
}

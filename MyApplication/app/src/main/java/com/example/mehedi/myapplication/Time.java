package com.example.mehedi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class Time extends AppCompatActivity {
    private TimePicker timePicker;
    private Button timeButton;
    private TextView timeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        timeButton=(Button)findViewById(R.id.timeSelectorButon);
        timeText=(TextView) findViewById(R.id.currentTimeId);
        timePicker=(TimePicker)findViewById(R.id.timePickerId);
        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time= null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                    time = "Selected Time: "+timePicker.getCurrentHour()+" : "+timePicker.getCurrentMinute();
                }
                timeText.setText(time);
            }
        });

    }
}

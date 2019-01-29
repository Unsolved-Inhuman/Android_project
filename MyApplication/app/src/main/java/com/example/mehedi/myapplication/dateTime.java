package com.example.mehedi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class dateTime extends AppCompatActivity {
    private DatePicker datePicker;
    private Button showButton;
    private TextView dateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);
        showButton=(Button)findViewById(R.id.dateSelectorButon);
        datePicker=(DatePicker)findViewById(R.id.datePickerId);
        dateText=(TextView)findViewById(R.id.currentDateId);
        dateText.setText(currentDate());

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateText.setText("Selected Date: "+currentDate());
            }
        });

    }
    String currentDate()
    {
        StringBuilder text=new StringBuilder();
        text.append(datePicker.getDayOfMonth()+"/");
        text.append((datePicker.getMonth()+1)+"/");
        text.append(datePicker.getYear());
        return text.toString();

    }
}

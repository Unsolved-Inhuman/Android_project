package com.example.mehedi.myapplication;

        import android.content.Intent;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.DatePicker;
        import android.widget.TextView;
        import android.widget.TimePicker;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private Button textButton,checkboxButton,dateButton,timeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textButton=(Button) findViewById(R.id.buttonId);
        checkboxButton=(Button) findViewById(R.id.checkButtonId);
        dateButton=(Button)findViewById(R.id.dateId);
        timeButton=(Button)findViewById(R.id.TimeId);
        Handler handler=new Handler();

        textButton.setOnClickListener(handler);
        checkboxButton.setOnClickListener(handler);
        dateButton.setOnClickListener(handler);
        timeButton.setOnClickListener(handler);

    }

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.buttonId) {
                Toast toast = Toast.makeText(MainActivity.this, "This Is New Text Window", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                Intent textWindow = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(textWindow);
            }
             if(v.getId()==R.id.checkButtonId) {
                Toast toast = Toast.makeText(MainActivity.this, "This Is New Checkbox Window", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                Intent newWindow = new Intent(MainActivity.this, radioButton.class);
                startActivity(newWindow);
            }
            if(v.getId()==R.id.dateId)
            {
                Toast toast = Toast.makeText(MainActivity.this, "This Is  Date Window", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                Intent newWindow = new Intent(MainActivity.this, dateTime.class);
                startActivity(newWindow);
            }
            if(v.getId()==R.id.TimeId)
            {
                Toast toast = Toast.makeText(MainActivity.this, "This Is Time Window", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                Intent newWindow = new Intent(MainActivity.this, Time.class);
                startActivity(newWindow);
            }

        }


    }
}

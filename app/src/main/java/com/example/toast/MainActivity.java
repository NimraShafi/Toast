package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fullName;
    TextView txt;
    Button button;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullName = (EditText) findViewById(R.id.txt);
        button = (Button) findViewById(R.id.button);
        txt = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = fullName.getText() .toString();
                Toast.makeText(MainActivity.this, "Welcome" +  name, Toast.LENGTH_SHORT).show();
                txt.setText(String.valueOf(counter++));

            }
        });



    }
}
package com.example.today_class_work;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText red,blue,green;
    TextView Hexcode;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red =(EditText) findViewById(R.id.redcolor);
        green =(EditText) findViewById(R.id.greencolor);
        blue =(EditText) findViewById(R.id.bluecolor);
        Hexcode =(TextView) findViewById(R.id.Hexcode);
        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String redhex=red.getText().toString();
                String greenhex=green.getText().toString();
                String bluehex=blue.getText().toString();
                String Hexcodegenerate = redhex + greenhex + bluehex;
                Hexcode.setText("#" + Hexcodegenerate);
                Hexcode.setBackgroundColor(Color.parseColor("#" + Hexcodegenerate));
            }
        });
    }
}
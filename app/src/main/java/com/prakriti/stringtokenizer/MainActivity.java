package com.prakriti.stringtokenizer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1 = findViewById(R.id.txt1);
        txt1.setText("This is my own text!");

        TextView txt2 = findViewById(R.id.txt2);
        TextView txt3 = findViewById(R.id.txt3);


        String myLine = txt1.getText().toString();
        StringTokenizer str = new StringTokenizer(myLine, "t");
        // default delimiter is space, tab, newline

        txt2.setText(str.nextToken());
        txt3.setText(str.nextToken());

    }
}
package com.example.fi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView out;
    TextView title;
    int time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out= findViewById(R.id.button);
        title = findViewById(R.id.top);
        Button btn = findViewById(R.id.button);

      btn.setOnClickListener(this);
     /*  btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        EditText inp = findViewById(R.id.editText);
        String str = inp.getText().toString();
        inp.setText("改了");


    }
    public void sendMessage(View view) {

        // Do something in response to button
    }

    @Override
    public void onClick(View view) {
        Log.i("main","onClick: ..........");
        out.setText("Clicked");



    }
}


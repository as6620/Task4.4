package com.example.task44;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int counterClick = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicked(View view){
        btn = findViewById(R.id.button);
        counterClick +=1;
        if (counterClick % 7 != 0) {
            btn.setText("This is a click number:" + counterClick);
        }
        else{
            btn.setText("Boom!");
        }
    }
}
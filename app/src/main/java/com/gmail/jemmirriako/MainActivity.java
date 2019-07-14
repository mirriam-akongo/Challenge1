package com.gmail.jemmirriako;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_one);
        Button button2 = (Button) findViewById(R.id.button_two);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityTwo();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityThree();
            }
        });
    }
    public void openActivityTwo(){
        Intent intent = new Intent(this, MainBActivity.class);
        startActivity(intent);


    }

    public void openActivityThree(){
        Intent intent = new Intent(this, MainCActivity.class);
        startActivity(intent);

    }
}

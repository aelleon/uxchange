package com.aelleon.ux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button angryButton = (Button) findViewById(R.id.angry_btn);
        angryButton.setTransformationMethod(null);
        Button trial = (Button) findViewById(R.id.trial);
        trial.setTransformationMethod(null);
    }
    public void nextAct(View v) {
        Intent intent = new Intent(this, signup_1.class);
        startActivity(intent);
    }

}

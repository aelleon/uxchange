package com.aelleon.ux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_1);
        Button parentButton = (Button) findViewById(R.id.parent_btn);
        parentButton.setTransformationMethod(null);
        Button childButton = (Button) findViewById(R.id.child_btn);
        childButton.setTransformationMethod(null);

    }

    public void onParent(View v) {
        Intent intent = new Intent(this, signupParent1.class);
        startActivity(intent);
    }

    public void onChild(View v) {
        Intent intent = new Intent(this, signupChild1.class);
        startActivity(intent);
    }
}

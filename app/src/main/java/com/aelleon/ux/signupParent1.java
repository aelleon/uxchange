package com.aelleon.ux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signupParent1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_parent1);

        Button childButton1 = (Button) findViewById(R.id.child_btn_1);
        childButton1.setTransformationMethod(null);

        Button childButton2 = (Button) findViewById(R.id.child_btn_2);
        childButton2.setTransformationMethod(null);

        Button childButton3 = (Button) findViewById(R.id.child_btn_3);
        childButton3.setTransformationMethod(null);

        Button childButton4 = (Button) findViewById(R.id.child_btn_4);
        childButton4.setTransformationMethod(null);
    }

    public void onChild1(View v) {
        Intent intent = new Intent(this, signupParentChild.class);
        startActivity(intent);

    }
    public void onChild2(View v) {
        Intent intent = new Intent(this, signupParentChild.class);
        startActivity(intent);

    }
    public void onChild3(View v) {
        Intent intent = new Intent(this, signupParentChild.class);
        startActivity(intent);

    }
    public void onChild4(View v) {

        Intent intent = new Intent(this, signupParentChild.class);
        startActivity(intent);
    }
}

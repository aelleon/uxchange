package com.aelleon.ux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signupChild1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_child1);
        Button childButton1 = (Button) findViewById(R.id.name_btn);
        childButton1.setTransformationMethod(null);

        Button childButton2 = (Button) findViewById(R.id.profile_btn);
        childButton2.setTransformationMethod(null);

        Button childButton3 = (Button) findViewById(R.id.age_btn);
        childButton3.setTransformationMethod(null);



    }

    public void onName(View view) {

    }
    public void onAge(View view) {

    }
    public void onProfile(View view) {
        //Intent intent = new Intent(this, signupParentChild);

    }
}

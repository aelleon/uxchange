package com.aelleon.ux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfileView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_view);
    }

    public void onProfile1(View view){
        Intent intent = new Intent(this, IndividualProfileView.class);
        startActivity(intent);
    }
    public void onProfile2(View view){
        Intent intent = new Intent(this, IndividualProfileView.class);
        startActivity(intent);
    }public void onProfile3(View view){
        Intent intent = new Intent(this, IndividualProfileView.class);
        startActivity(intent);
    }public void onProfile4(View view){
        Intent intent = new Intent(this, IndividualProfileView.class);
        startActivity(intent);
    }



}

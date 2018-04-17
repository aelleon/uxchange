package com.aelleon.ux;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signupParentChild extends AppCompatActivity {
    Button childButton2;
    EditText childButton1;
    EditText childButton3;
    EditText childButton4;
    AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_parent_child);
        childButton1 = (EditText) findViewById(R.id.child_btn_1);


        childButton2 = (Button) findViewById(R.id.child_btn_2);
        childButton2.setTransformationMethod(null);

        childButton3 = (EditText) findViewById(R.id.child_btn_3);


        childButton4 = (EditText) findViewById(R.id.child_btn_4);
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "child").build();

    }

    public void onAccount(View view) {

    }
    public void onRouting(View view) {

    }
    public void onPin(View view) {

    }
    public void onSave(View view) {
        int accounting = Integer.valueOf(childButton1.getText().toString());
        int routing = Integer.valueOf(childButton4.getText().toString());
        int pin = Integer.valueOf(childButton3.getText().toString());

        Child child = new Child();
        child.setBankNumber(accounting);
        child.setRoutingNumber(routing);
        child.setPinNumber(pin);



        Intent intent = new Intent(this, ProfileView.class);
        startActivity(intent);
    }

    public void onProfile(View view) {
        Intent intent = new Intent(this, ProfileView.class);
        startActivity(intent);
    }

}

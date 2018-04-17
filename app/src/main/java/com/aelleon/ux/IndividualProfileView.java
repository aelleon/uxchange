package com.aelleon.ux;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.hdodenhof.circleimageview.CircleImageView;

public class IndividualProfileView extends AppCompatActivity {
    CircleImageView profileView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_profile_view);

        Button angryButton = (Button) findViewById(R.id.goals_btn);
        angryButton.setTransformationMethod(null);
        profileView = (CircleImageView)findViewById(R.id.profile_image);
    }

    public void onGoals(View view) {

    }
    static final int REQUEST_IMAGE=1;

    public void onCamera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(intent.resolveActivity(getPackageManager())!=null) {
            startActivityForResult(intent, REQUEST_IMAGE);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_IMAGE && resultCode == RESULT_OK) {
            Bundle extra = data.getExtras();
            Bitmap bitmap = (Bitmap)extra.get("data");
            Drawable color = new ColorDrawable(0000);
            Drawable image = getResources().getDrawable(R.drawable.back1);
            LayerDrawable ld = new LayerDrawable(new Drawable[]{color, image});
            profileView.setImageDrawable(ld);
           // profile_image.setBackground(new BitmapDrawable(getResources(), bitmap));
        }
    }

}

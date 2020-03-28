package com.example.weekly_food;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Profile extends AppCompatActivity {

    private TextView userName,description, follow, followNum, follower, followerNum;
    private CircleImageView profileImage;
    private ImageView note1, note2, note3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        userName = (TextView) findViewById(R.id.my_username);
        description = (TextView) findViewById(R.id.my_profile_description);
        follow = (TextView) findViewById(R.id.my_follow);
        followNum = (TextView) findViewById(R.id.my_follow_num);
        follower = (TextView) findViewById(R.id.my_follower);
        followerNum = (TextView) findViewById(R.id.my_follower_num);

        profileImage = (CircleImageView) findViewById((R.id.my_profile_pic));

        note1 = (ImageView)findViewById(R.id.my_notes1);
        note2 = (ImageView)findViewById(R.id.my_notes2);
        note3 = (ImageView)findViewById(R.id.my_notes3);

    }
}

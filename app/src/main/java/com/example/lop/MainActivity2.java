package com.example.lop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView user_profile;
    TextView name_user,roll_user,skill_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        user_profile=findViewById(R.id.user_profile);
        name_user=findViewById(R.id.name_user);
        roll_user=findViewById(R.id.roll_user);
        skill_user=findViewById(R.id.skill_user);


        Intent intent = getIntent();

        String username=intent.getStringExtra("m1");
        String userroll=intent.getStringExtra("m2");
        String userskills=intent.getStringExtra("m3");
        int userprofile = intent.getIntExtra("m4",R.drawable.w2);

        name_user.setText(username);
        skill_user.setText(userskills);
        roll_user.setText(userroll);
        user_profile.setImageResource(userprofile);


    }
}
package com.example.lop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;


    String []data={"Sandeep","Aman","Zakheer","Ishant","Dhatarwall","Babaar","Shradha","Himanshu","Shuhani","Aalia"};
    String []roll_number={"1","2","3","4","5","6","7","8","9","10"};
    String [] user_skills={"Android Developer","Java","Python","Graphic Designer","M.L","A.I","Logo Designer","Adobe Illustrator","Video Editor","Adobe XD"};
    Integer [] user_profile={R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4,R.drawable.w5,R.drawable.w6,R.drawable.w7,R.drawable.w8,R.drawable.w9,R.drawable.w10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.lv);


        harry_Adapter ad=new harry_Adapter(this,R.layout.list_custom,data,roll_number,user_skills,user_profile);
        lv.setAdapter(ad);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String select=lv.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, "" + select, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("m4",user_profile[i]);
                intent.putExtra("m1",data[i]);
                intent.putExtra("m3",user_skills[i]);
                intent.putExtra("m2",roll_number[i]);
                startActivity(intent);


            }
        });

    }
}
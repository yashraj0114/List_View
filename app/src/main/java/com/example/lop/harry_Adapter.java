package com.example.lop;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class harry_Adapter extends ArrayAdapter<String> {



    private String [] data;
    private String [] roll_numbers;
    private String [] user_skills;
    private Integer [] user_profile;

    public harry_Adapter(@NonNull Context context, int resource, @NonNull String[] data,String [] roll_numbers, String[] user_skills,Integer[] user_profile) {
        super(context, resource, data);
        this.data=data;
        this.roll_numbers=roll_numbers;
        this.user_skills=user_skills;
        this.user_profile=user_profile;

    }


    @Nullable
    @Override
    public String getItem(int position) {
            return data[position];
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_custom,parent,false);
        TextView t1=convertView.findViewById(R.id.user_name);
        TextView t2=convertView.findViewById(R.id.user_roll);
        TextView t3=convertView.findViewById(R.id.user_skill);
        ImageView t4=convertView.findViewById(R.id.user_profile);

        t1.setText(getItem(position));
        t2.setText(roll_numbers[position]);
        t3.setText(user_skills[position]);
        t4.setImageResource(user_profile[position]);


        return convertView;
    }
}




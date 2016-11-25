package com.example.inhatc.myapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout1;
    LinearLayout layout2;
    Switch sw1;
    RadioGroup rg1;
    Button bt1;
    Button bt2;
    ImageView iv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1 = (LinearLayout)findViewById(R.id.layout1);
        layout2 = (LinearLayout)findViewById(R.id.layout2);

        setTitle("안드로이드 사진보기");
        setSwitch();
        setButton();
        setRadioGroup();
        setImageViwe();
    }

    void setSwitch(){
        sw1 = (Switch) findViewById(R.id.switch1);
        sw1.setChecked(false);
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sw1.isChecked())
                    layout2.setVisibility(View.VISIBLE);
                else
                    layout2.setVisibility(View.INVISIBLE);
            }
        });
    }

    void setRadioGroup(){
        rg1 = (RadioGroup)findViewById(R.id.radioGroup);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton1)
                    iv1.setImageResource(R.drawable.bori);
                else if(checkedId==R.id.radioButton2)
                    iv1.setImageResource(R.drawable.cat);
                else if(checkedId==R.id.radioButton3)
                    iv1.setImageResource(R.drawable.kiwii);
            }
        });

    }

    void setButton(){
        bt1 = (Button)findViewById(R.id.button);
        bt2 =  (Button)findViewById(R.id.button2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw1.setChecked(false);
            }
        });

    }

    void setImageViwe(){
        iv1 = (ImageView)findViewById(R.id.imageView);
    }
}

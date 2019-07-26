package com.saiproject.radiobutton;

import android.media.Rating;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,SeekBar.OnSeekBarChangeListener
,RatingBar.OnRatingBarChangeListener,RadioGroup.OnCheckedChangeListener{

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;


    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;


    RadioGroup radioGroup;


    SeekBar seekBar;
    RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        checkBox1=findViewById(R.id.checkBox1);
        checkBox2= findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6  = findViewById(R.id.checkBox6);

        radioGroup  = findViewById(R.id.radioGroup);

        radioButton1  = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);

        seekBar = findViewById(R.id.seekBar);
        ratingBar= findViewById(R.id.ratingBar);



        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);
        checkBox3.setOnCheckedChangeListener(this);
        checkBox4.setOnCheckedChangeListener(this);
        checkBox5.setOnCheckedChangeListener(this);
        checkBox6.setOnCheckedChangeListener(this);


        seekBar.setOnSeekBarChangeListener(this);


        ratingBar.setOnRatingBarChangeListener(this);

        radioGroup.setOnCheckedChangeListener(this);

    }

    /* RadioGroup Listener */

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId){

            case R.id.radioButton1:
                Toast.makeText(this, radioButton1.getText(), Toast.LENGTH_SHORT).show();

            case R.id.radioButton2:
                Toast.makeText(this, radioButton2.getText(), Toast.LENGTH_SHORT).show();

            case R.id.radioButton3:
                Toast.makeText(this, radioButton3.getText(), Toast.LENGTH_SHORT).show();


        }

    }




    /* Rating Bar Listener */


    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

        Toast.makeText(this, "The rating is " + rating, Toast.LENGTH_SHORT).show();
    }



/* Seekbar Listener */
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        Toast.makeText(this, "The progress is " + progress, Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

        Toast.makeText(this, "Seekbar has started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

        Toast.makeText(this, "Seekbar has stopped", Toast.LENGTH_SHORT).show();
    }




    /* CheckBox listener */

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch(buttonView.getId()) {

            case R.id.checkBox1:
                if (isChecked)
                    Toast.makeText(this, checkBox1.getText() + " is Checked", Toast.LENGTH_SHORT).show();
                    break;


            case R.id.checkBox2:
                if (isChecked)
                    Toast.makeText(this, checkBox2.getText()+ " is Checked", Toast.LENGTH_SHORT).show();
                break;


            case R.id.checkBox3:
                if (isChecked)
                    Toast.makeText(this, checkBox3.getText()+ " is Checked", Toast.LENGTH_SHORT).show();
                break;


            case R.id.checkBox4:
                if (isChecked)
                    Toast.makeText(this, checkBox4.getText()+ " is Checked", Toast.LENGTH_SHORT).show();
                break;


            case R.id.checkBox5:
                if (isChecked)
                    Toast.makeText(this, checkBox5.getText()+ " is Checked", Toast.LENGTH_SHORT).show();
                break;


            case R.id.checkBox6:
                if (isChecked)
                    Toast.makeText(this,checkBox6.getText()+ " is Checked",Toast.LENGTH_SHORT).show();
                break;

        }


    }
}

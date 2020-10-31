package com.example.achievementsanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imageView;
    private ImageButton backButton, rightButton;
    private EditText firstname, secondname, thirdname, forthname,
            firstcredits, secondcredits, thirdcredits, forthcredits,
            firstgrades, secondgrades, thirdgrades, forthgrades;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        backButton = findViewById(R.id.back);
        rightButton = findViewById(R.id.right);
        firstname = findViewById(R.id.name_first_input);
        firstcredits = findViewById(R.id.credits_first_input);
        firstgrades = findViewById(R.id.grades_first_input);
        secondname = findViewById(R.id.name_second_input);
        secondcredits = findViewById(R.id.credits_second_input);
        secondgrades = findViewById(R.id.grades_second_input);
        thirdname = findViewById(R.id.name_third_input);
        thirdcredits = findViewById(R.id.credits_third_input);
        thirdgrades = findViewById(R.id.grades_third_input);
        forthname = findViewById(R.id.name_forth_input);
        forthcredits = findViewById(R.id.credits_forth_input);
        forthgrades = findViewById(R.id.grades_forth_input);
        backButton=findViewById(R.id.back);
         backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity.class);
                finish();
                startActivity(intent1);
            }
        });
         rightButton=findViewById(R.id.right);
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // Toast.makeText(MainActivity2.this, "各项均不能为空,请输入完整", Toast.LENGTH_SHORT).show();
                 String ed_firstname = firstname.getText().toString();
                 String ed_firstcredits =firstcredits.getText().toString();
                 String ed_firstgrades = firstgrades.getText().toString();
                 String ed_secondname = secondname.getText().toString();
                 String ed_secondcredits = secondcredits.getText().toString();
                 String ed_secondgrades =secondgrades.getText().toString();
                 String ed_thirdname = thirdname.getText().toString();
                 String ed_thirdcredits = thirdcredits.getText().toString();
                 String ed_thirdgrades =thirdgrades.getText().toString();
                 String ed_forthname = forthname.getText().toString();
                 String ed_forthcredits = forthcredits.getText().toString();
                 String ed_forthgrades = forthgrades.getText().toString();
                if(TextUtils.isEmpty(ed_firstname)||TextUtils.isEmpty(ed_secondname)||TextUtils.isEmpty(ed_thirdname)||
                TextUtils.isEmpty(ed_forthname)||TextUtils.isEmpty(ed_firstcredits)||TextUtils.isEmpty(ed_firstgrades)||
                TextUtils.isEmpty(ed_secondcredits)||TextUtils.isEmpty(ed_secondgrades)||TextUtils.isEmpty(ed_thirdcredits)
                ||TextUtils.isEmpty(ed_thirdgrades)||TextUtils.isEmpty(ed_forthcredits)||TextUtils.isEmpty(ed_forthgrades))
                    Toast.makeText(MainActivity2.this, "各项均不能为空,请输入完整", Toast.LENGTH_LONG).show();


             else if((Double.parseDouble(ed_firstcredits)>6)||(Double.parseDouble(ed_secondcredits)>6)||(Double.parseDouble(ed_thirdcredits)>6)||
                (Double.parseDouble(ed_forthcredits)>6))
                    Toast.makeText(MainActivity2.this, "您输入的学分超出正常范围，请再次输入", Toast.LENGTH_LONG).show();
                else if((Double.parseDouble(ed_firstgrades)>100)||(Double.parseDouble(ed_secondgrades)>100)||
                        (Double.parseDouble(ed_thirdgrades)>100)||(Double.parseDouble(ed_forthgrades)>100))
                    Toast.makeText(MainActivity2.this, "您输入的学科成绩超出正常范围，请您再次输入", Toast.LENGTH_LONG).show();

                else if((Double.parseDouble(ed_firstcredits)==0)||(Double.parseDouble(ed_firstgrades)==0)||
                        (Double.parseDouble(ed_secondcredits)==0)||(Double.parseDouble(ed_secondgrades)==0)||
                        (Double.parseDouble(ed_thirdcredits)==0)||(Double.parseDouble(ed_thirdgrades)==0)||
                        (Double.parseDouble(ed_forthcredits)==0)||(Double.parseDouble(ed_forthgrades)==0))
                    Toast.makeText(MainActivity2.this, "您输入的成绩不要为0", Toast.LENGTH_SHORT).show();
                else{Intent intent2 = new Intent(MainActivity2.this, MainActivity3.class);
                intent2.putExtra("firstname",ed_firstname);
                intent2.putExtra("firstcredit",ed_firstcredits);
                intent2.putExtra("firstgrade",ed_firstgrades);
                intent2.putExtra("secondname",ed_secondname);
                intent2.putExtra("secondcredit",ed_secondcredits);
                intent2.putExtra("secondgrade",ed_secondgrades);
                intent2.putExtra("thirdname",ed_thirdname);
                intent2.putExtra("thirdcredit", ed_thirdcredits);
                intent2.putExtra("thirdgrade", ed_thirdgrades);
                intent2.putExtra("forthname",ed_forthname);
                intent2.putExtra("forthcredit", ed_forthcredits);
                intent2.putExtra("forthgrade", ed_forthgrades);
                finish();
                startActivity(intent2);}
            }

        });
    }
}

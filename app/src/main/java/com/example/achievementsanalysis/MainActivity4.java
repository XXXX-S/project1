package com.example.achievementsanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;
public class MainActivity4 extends AppCompatActivity {
    private ImageButton back;
    private TextView advice1,advice2,advice3,advice4,advice5,advice6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        advice1=findViewById(R.id.advice1);
       //advice2=findViewById(R.id.advice2);
        advice3=findViewById(R.id.advice3);
        advice4=findViewById(R.id.advice4);
        advice5=findViewById(R.id.advice5);
        advice6=findViewById(R.id.advice6);
        back=findViewById(R.id.back);
       Intent intent5=getIntent();
        final String G=intent5.getStringExtra("GRADE");
        final String S=intent5.getStringExtra("STABILITY");
        final String Fp=intent5.getStringExtra("First_point");
        final String Sp=intent5.getStringExtra("Second_point");
        final String Tp=intent5.getStringExtra("Third_point");
        final String FP=intent5.getStringExtra("Forth_point");
        final String name1=intent5.getStringExtra("Firstname");
        final String name2=intent5.getStringExtra("Secondname");
        final String name3=intent5.getStringExtra("Thirdname");
        final String name4=intent5.getStringExtra("Forthname");

        if(G.equals("A")) advice1.setText("1.您的总成绩很好，请继续保持，加油！");
        else if(G.equals("B")) advice1.setText("1.您的总成绩良好，请继续加油，你可以做的更好。");
        else if(G.equals("C")) advice1.setText("1.您的总成绩即将不合格，请注意！！");
        else if (G.equals("D"))advice1.setText("1.您的总成绩不合格,请继续努力");

        if(Fp.equals("A")) advice3.setText("2.您的"+String.valueOf(name1)+"非常优秀");
        else if(Fp.equals("B"))
            advice3.setText("2.您的"+String.valueOf(name1)+"成绩良好，但仍有进步空间，加油");
        else if(Fp.equals("C"))
            advice3.setText("2.您的"+String.valueOf(name1)+"成绩较差，仍有很大的进步空间");
        else if (Fp.equals("D"))
            advice3.setText("2.您的"+String.valueOf(name1)+"成绩很差，请反思自己的学习态度");

        if(Sp.equals("A")) advice4.setText("3.您的"+String.valueOf(name2)+"非常优秀");
        else if(Sp.equals("B"))
            advice4.setText("3.您的"+String.valueOf(name2)+"成绩良好，但仍有进步空间，加油");
        else if(Sp.equals("C"))
            advice4.setText("3.您的"+String.valueOf(name2)+"成绩较差，仍有很大的进步空间");
        else if(Sp.equals("D"))
            advice4.setText("3.您的"+String.valueOf(name2)+"成绩很差，请反思自己的学习态度");

        if(Tp.equals("A")) advice5.setText("4.您的"+String.valueOf(name3)+"非常优秀");
        else if(Tp.equals("B"))
            advice5.setText("4.您的"+String.valueOf(name3)+"成绩良好，但仍有进步空间，加油");
        else if(Tp.equals("C"))
            advice5.setText("4.您的"+String.valueOf(name3)+"成绩较差，仍有很大的进步空间");
        else if(Tp.equals("D"))
            advice5.setText("4.您的"+String.valueOf(name3)+"成绩很差，请反思自己的学习态度");

        if(FP.equals("A")) advice6.setText("5.您的"+String.valueOf(name4)+"非常优秀");
        else if(FP.equals("B"))
            advice6.setText("5.您的"+String.valueOf(name4)+"成绩良好，但仍有进步空间，加油");
        else if(FP.equals("C"))
            advice6.setText("5.您的"+String.valueOf(name4)+"成绩较差，仍有很大的进步空间");
        else if(Fp.equals("D"))
            advice6.setText("5.您的"+String.valueOf(name4)+"成绩很差，请反思自己的学习态度");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent();
                intent6.setClass(MainActivity4.this,MainActivity3.class);
                finish();
                startActivity(intent6);
            }
        });
    }
}

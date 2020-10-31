package com.example.achievementsanalysis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity3 extends AppCompatActivity {
    private ImageButton back,next;
    private TextView achievements,gpa,credits,stability,level,firstsubject,secondsubject,thirdsubject,forthsubject,
            FirstGrade,SecondGrade,ThirdGrade,ForthGrade,first_point,second_point,
    third_point,forth_point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent();
                intent3.setClass(MainActivity3.this,MainActivity4.class);
                finish();
                startActivity(intent3);
            }
        });
        level=findViewById(R.id.level);
        firstsubject=findViewById(R.id.firstsubject);
        secondsubject=findViewById(R.id.secondsubject);
        thirdsubject=findViewById(R.id.thirdsubject);
        forthsubject=findViewById(R.id.forthsubject);
        FirstGrade=findViewById(R.id.first_grade);
        first_point=findViewById(R.id.first_point);
        second_point=findViewById(R.id.second_ponit);
        SecondGrade=findViewById(R.id.second_grade);
        third_point=findViewById(R.id.third_point);
        ThirdGrade=findViewById(R.id.third_grade);
        forth_point=findViewById(R.id.forth_ponit);
        ForthGrade=findViewById(R.id.forth_grade);
        Intent intent2 = getIntent();
        final String Firstname=intent2.getStringExtra("firstname");
        Log.d("MainActivity3",Firstname);
        final String  firstcredit=intent2.getStringExtra("firstcredit");
        Log.d("MainActivity3",firstcredit);
        final double Firstcredit=Double.parseDouble(firstcredit);
        final String firstgrade=intent2.getStringExtra("firstgrade");
        Log.d("MainActivity3",firstgrade);
        final double Firstgrade=Double.parseDouble(firstgrade);

        final String Secondname=intent2.getStringExtra("secondname");
        Log.d("MainActivity3",Secondname);
        final String secondcredit=intent2.getStringExtra("secondcredit");
        Log.d("MainActivity3",secondcredit);
        final double Secondcredit=Double.parseDouble(secondcredit);
        final String secondgrade=intent2.getStringExtra("secondgrade");
        Log.d("MainActivity3",secondgrade);
        final double Secondgrade=Double.parseDouble(secondgrade);
        final String Thirdname=intent2.getStringExtra("thirdname");
        Log.d("MainActivity3",Thirdname);
        String thirdcredit=intent2.getStringExtra("thirdcredit");
        Log.d("MainActivity3",thirdcredit);
        final double Thirdcredit=Double.parseDouble(thirdcredit);
        final String thirdgrade=intent2.getStringExtra("thirdgrade");
        Log.d("MainActivity3",thirdgrade);
        final double Thirdgrade=Double.parseDouble(thirdgrade);
        final String Forthname=intent2.getStringExtra("forthname");
        Log.d("MainActivity3",Firstname);
        final String forthcredit=intent2.getStringExtra("forthcredit");
        Log.d("MainActivity3",firstcredit);
        final double Forthcredit=Double.parseDouble(forthcredit);
        final String forthgrade=intent2.getStringExtra("forthgrade");
        Log.d("MainActivity3",forthgrade);
        final double Forthgrade=Double.parseDouble(forthgrade);
        final double grade=(Firstgrade*Firstcredit+Secondgrade*Secondcredit+Thirdgrade*Thirdcredit+Forthgrade*Forthcredit)/
                (Firstcredit+Secondcredit+Thirdcredit+Forthcredit);
        java.text.DecimalFormat G=new java.text.DecimalFormat("#.##");
        final String GRADE=String.valueOf(G.format(grade));
        final String GRADE_;
        if(grade<=100&&grade>85) GRADE_="A";
        else if(grade<=85&&grade>70) GRADE_="B";
        else if(grade<=70&&grade>60) GRADE_="C";
        else GRADE_="D";
        final double Firstpoint;
        final String fg;
        if(90<=Firstgrade&&Firstgrade<=100) {
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"A"); Firstpoint=4.0;fg="A";
        }
        else if(86<=Firstgrade&&Firstgrade<=89) {
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"A-"); Firstpoint=3.7;fg="A";
        }
        else if(83<=Firstgrade&&Firstgrade<=85) {
            firstsubject.setText(String.valueOf(Firstname) +":"+"     " + "B+");Firstpoint=3.3;fg="B";
        }
        else if(80<=Firstgrade&&Firstgrade<=82){
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"B");Firstpoint=3.0;fg="B";
        }
        else if(76<=Firstgrade&&Firstgrade<=79)  {
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"B-"); Firstpoint=2.7;fg="B";
        }
        else if(73<=Firstgrade&&Firstgrade<=75) {
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"B"); Firstpoint=2.3;fg="C";
        }
        else if(70<=Firstgrade&&Firstgrade<=72)  {
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"C+"); Firstpoint=2.0;fg="C";
        }
        else if(66<=Firstgrade&&Firstgrade<=69){
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"C-");  Firstpoint=1.7;fg="D";
        }
        else if(63<=Firstgrade&&Firstgrade<=65) {
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"D+"); Firstpoint=1.3;fg="D";
        }
        else if(60<=Firstgrade&&Firstgrade<=62){
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"D"); Firstpoint=1.0;fg="E";
        }
        else {
            firstsubject.setText(String.valueOf(Firstname)+":"+"     "+"F"); Firstpoint=0;fg="E";
        }
        final String First_point=String.valueOf(Firstpoint);
        final double Secondpoint;
        final String sp;
        if(90<=Secondgrade&&Secondgrade<=100) {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"A");Secondpoint=4.0;sp="A";
        }
        else if(86<=Secondgrade&&Secondgrade<=89)  {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"A-");Secondpoint=3.7;sp="A";
        }
        else if(83<=Secondgrade&&Secondgrade<=85) {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"B+");Secondpoint=3.3;sp="B";
        }
        else if(80<=Secondgrade&&Secondgrade<=82) {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"B");Secondpoint=3.0;sp="B";
        }
        else if(76<=Secondgrade&&Secondgrade<=79)  {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"B-");Secondpoint=2.7;sp="B";
        }
        else if(73<=Secondgrade&&Secondgrade<=75) {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"B");Secondpoint=2.3;sp="C";
        }
        else if(70<=Secondgrade&&Secondgrade<=72) {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"C+");Secondpoint=2.0;sp="C";
        }
        else if(66<=Secondgrade&&Secondgrade<=69){
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"C-");Secondpoint=1.7;sp="D";
        }
        else if(63<=Secondgrade&&Secondgrade<=65)  {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"D+");Secondpoint=1.3;sp="D";
        }
        else if(60<=Secondgrade&&Secondgrade<=62) {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"D");Secondpoint=1.0;sp="E";
        }
       else   {
            secondsubject.setText(String.valueOf(Secondname)+":"+"     "+"F");Secondpoint=0;sp="E";
        }
        final String Second_point=String.valueOf(Secondpoint);
       final double Thirdpoint;
       final String tg;
         if(90<=Thirdgrade&&Thirdgrade<=100) {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"A");Thirdpoint=4.0;tg="A";
        }
        else if(86<=Thirdgrade&&Thirdgrade<=89)  {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"A-"); Thirdpoint=3.7;tg="A";
         }
        else if(83<=Thirdgrade&&Thirdgrade<=85) {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"B+");Thirdpoint=3.3;tg="B";
         }
        else if(80<=Thirdgrade&&Thirdgrade<=82)  {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"B");Thirdpoint=3.0;tg="B";
         }
        else if(76<=Thirdgrade&&Thirdgrade<=79) {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"B-");Thirdpoint=2.7;tg="B";
         }
        else if(73<=Thirdgrade&&Thirdgrade<=75)  {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"B");Thirdpoint=2.3;tg="C";
         }
        else if(70<=Thirdgrade&&Thirdgrade<=72) {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"C+");Thirdpoint=2.0;tg="C";
         }
        else if(66<=Thirdgrade&&Thirdgrade<=69)  {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"C-");Thirdpoint=1.7;tg="D";
         }
        else if(63<=Thirdgrade&&Thirdgrade<=65)  {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"D+");Thirdpoint=1.3;tg="D";
         }
        else if(60<=Thirdgrade&&Thirdgrade<=62)  {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"D");Thirdpoint=1.0;tg="E";
         }
        else  {
            thirdsubject.setText(String.valueOf(Thirdname)+":"+"     "+"F");Thirdpoint=0;tg="E";
         }
        final String Third_point=String.valueOf(Thirdpoint);
        final double Forthpoint;
        final String FP;
        if(90<=Forthgrade&&Forthgrade<=100){
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"A");Forthpoint=4.0;FP="A";
        }
        else if(86<=Forthgrade&&Forthgrade<=89) {
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"A-");Forthpoint=3.7;FP="A";
        }
        else if(83<=Forthgrade&&Forthgrade<=85){
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"B+");Forthpoint=3.3;FP="B";
        }
        else if(80<=Forthgrade&&Forthgrade<=82){
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"B");Forthpoint=3.0;FP="B";
        }
        else if(76<=Forthgrade&&Forthgrade<=79) {
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"B-");Forthpoint=2.7;FP="B";
        }
        else if(73<=Forthgrade&&Forthgrade<=75) {
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"B");Forthpoint=2.3;FP="C";
        }
       else if(70<=Forthgrade&&Forthgrade<=72) {
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"C+");Forthpoint=2.0;FP="C";
        }
       else if(66<=Forthgrade&&Forthgrade<=69) {
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"C-");Forthpoint=1.7;FP="D";
        }
        else if(63<=Forthgrade&&Forthgrade<=65)  {
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"D+");Forthpoint=1.3;FP="D";
        }
        else if(60<=Forthgrade&&Forthgrade<=62) {
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"D");Forthpoint=1.0;FP="E";
        }
       else {
            forthsubject.setText(String.valueOf(Forthname)+":"+"     "+"F");Forthpoint=0;FP="E";
        }
        final String Forth_point=String.valueOf(Forthpoint);
        achievements=findViewById(R.id.achievements);
        achievements.setText(GRADE);
        gpa=findViewById(R.id.gpa);
        double point=(Firstpoint*Firstcredit+Secondpoint*Secondcredit+Thirdpoint*Thirdcredit+Forthpoint*Forthcredit)/
                (Firstcredit+Secondcredit+Thirdcredit+Forthcredit);
        gpa.setText("绩点："+String.valueOf(G.format(point)));
        credits=findViewById(R.id.credits);
        double credit=Firstgrade+Secondcredit+Thirdcredit+Firstcredit;
        credits.setText("总学分："+String .valueOf(credit));
        stability=findViewById(R.id.stability);
        double average=(Firstgrade+Secondgrade+Thirdgrade+Forthgrade)/4;
        final double Stability=((Firstgrade-average)*(Firstgrade-average)+(Secondgrade-average)*(Secondgrade-average)+
                (Thirdgrade-average)*(Thirdgrade-average)+(Forthgrade-average)*(Forthgrade-average))/4;
        final String STABILITY=String.valueOf(Stability);
        if(0<Stability&&Stability<0.99) stability.setText("优秀");
        else if(1<Stability&&Stability<3.99) stability.setText("良好");
        else if(4<Stability&&9.99<Stability) stability.setText("较差");
        else if(Stability>10) stability.setText("差");
        FirstGrade.setText(String.valueOf(firstgrade));
        first_point.setText(String.valueOf(First_point));
        SecondGrade.setText(String.valueOf(secondgrade));
        second_point.setText(String.valueOf(Second_point));
        ThirdGrade.setText(String.valueOf(thirdgrade));
        third_point.setText(String.valueOf(Third_point));
        ForthGrade.setText(String.valueOf(forthgrade));
        forth_point.setText(String.valueOf(Forth_point));
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity3.this,MainActivity4.class);
                intent4.putExtra("GRADE",GRADE_);
                intent4.putExtra("First_point",fg);
                intent4.putExtra("Second_point",sp);
                intent4.putExtra("Third_point",tg);
                intent4.putExtra("Forth_point",FP);
                intent4.putExtra("Firstname",Firstname);
                intent4.putExtra("Secondname",Secondname);
                intent4.putExtra("Thirdname",Thirdname);
                intent4.putExtra("Forthname",Forthname);
                finish();
            startActivity(intent4);
            }
        });
    }
}

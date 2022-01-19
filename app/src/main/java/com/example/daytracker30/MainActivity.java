package com.example.daytracker30;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int start_time=7;
    int end_time=23;

    Button timebtn; //30분단위 버튼
    LinearLayout btnll; //버튼들어갈 레이아웃
    TextView tv; //시간

    Button changetracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnll = new LinearLayout(this);
        tv = new TextView(this);
        timebtn = new Button(this);


        findViewById(R.id.timebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showcustomDialog();
            }
        });

    }

    private void showcustomDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this
                , R.style.AlertDialogTheme);

        View view = LayoutInflater.from(MainActivity.this).inflate(
                R.layout.dialog_simple_time,
                (LinearLayout)findViewById(R.id.dialog_simpletime));

        //다이얼로그 텍스트 설정
        //순서대로
        //시간기록
        //반복문 안에 기본 버튼들
        builder.setView(view);
        ((TextView)view.findViewById(R.id.dialog_title1)).setText("시간 기록");
        ((Button)view.findViewById(R.id.btnsimple)).setText("    외출준비    ");

        AlertDialog alertDialog = builder.create();
        view.findViewById(R.id.btnsimple).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        if(alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }

        alertDialog.show();
    }



}
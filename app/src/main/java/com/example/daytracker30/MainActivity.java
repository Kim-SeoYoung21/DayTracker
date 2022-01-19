package com.example.daytracker30;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int start_time;
    int end_time;

    private Button t61;


    //LinearLayout btnll; //버튼들어갈 레이아웃
    //TextView tv; //시간

    //private ListView list; //30분단위 리스트뷰
    //int list_count;       //반복문을 위한 변수
    //private Button colorbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t61 = findViewById(R.id.t61);
        t61.setOnClickListener(new View.OnClickListener() {
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
                t61.setBackgroundResource(R.drawable.dialog_button);
                t61.setText("외출 준비");
                alertDialog.dismiss();
            }
        });

        if(alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }

        alertDialog.show();
    }



}
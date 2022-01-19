package com.example.daytracker30;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

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

    Button btnsimple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnsimple = (Button)findViewById(R.id.btnsimple);
        btnsimple.setOnClickListener(btnListener);
        //btnTime = new Button[36];
        /*int [] btnId = { R.id.t61, R.id.t62, R.id.t71, R.id.t72, R.id.t81, R.id.t82,
                R.id.t91, R.id.t92, R.id.t101, R.id.t102, R.id.t111, R.id.t121,
                R.id.t122,
                R.id.t011, R.id.t012, R.id.t021, R.id.t022, R.id.t31, R.id.t32,
                R.id.t41, R.id.t42, R.id.t51, R.id.t52, R.id.t611, R.id.t621,
                R.id.t711, R.id.t721, R.id.t811, R.id.t821, R.id.t911, R.id.t921,
                R.id.t1011, R.id.t1021, R.id.t1111, R.id.t1121};

        for(int i=0;i<36;i++)
        {
            btnTime[i] = (Button)findViewById(btnId[i]);
        }
        for(int i=0;i<36;i++)
        {
            btnTime[i].setOnClickListener(btnListener);
        }*/

        /*t61 = findViewById(R.id.t61);
        t61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showcustomDialog();
            }
        });*/

    }
    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            showcustomDialog();
        }
    };

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

        //Button = (Button) v.

        view.findViewById(R.id.btnsimple).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnsimple.setBackgroundResource(R.drawable.dialog_button);
                btnsimple.setText("외출 준비");
                alertDialog.dismiss();
            }
        });

        if(alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }

        alertDialog.show();
    }



}
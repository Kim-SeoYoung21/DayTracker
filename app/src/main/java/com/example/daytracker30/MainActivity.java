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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int start_time;
    int end_time;
    String sButton="t61";

    private Button t61, t62, t71, t72, t81, t82, t31, t32, t41, t42, t51, t52;
    private Button sBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t61 = findViewById(R.id.t61);
        t62 = findViewById(R.id.t62);
        t71 = findViewById(R.id.t71);
        t72 = findViewById(R.id.t72);
        t81 = findViewById(R.id.t81);
        t82 = findViewById(R.id.t82);
        t31 = findViewById(R.id.t31);
        t32 = findViewById(R.id.t32);
        t41 = findViewById(R.id.t41);
        t42 = findViewById(R.id.t42);
        t51 = findViewById(R.id.t51);
        t52 = findViewById(R.id.t52);
        sBtn = t61;


        t61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t61;
                showcustomDialog();
            }
        });
        t62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t62;
                showcustomDialog();
            }
        });
        t71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t71;
                showcustomDialog();
            }
        });
        t72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t72;
                showcustomDialog();
            }
        });
        t81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t81;
                showcustomDialog();
            }
        });
        t82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t82;
                showcustomDialog();
            }
        });
        t31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t31;
                showcustomDialog();
            }
        });
        t32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t32;
                showcustomDialog();
            }
        });
        t41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t41;
                showcustomDialog();
            }
        });
        t42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t42;
                showcustomDialog();
            }
        });
        t51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t51;
                showcustomDialog();
            }
        });
        t52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn = t52;
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
        builder.setView(view);
        ((TextView)view.findViewById(R.id.dialog_title1)).setText("시간 기록");
        ((Button)view.findViewById(R.id.btn1)).setText("    외출준비    ");
        ((Button)view.findViewById(R.id.btn2)).setText("    토익공부    ");
        ((Button)view.findViewById(R.id.btn3)).setText("    LUNCH    ");
        ((Button)view.findViewById(R.id.btn4)).setText("    책 읽기    ");
        ((Button)view.findViewById(R.id.btn5)).setText("    BREAKFAST    ");
        view.findViewById(R.id.imgbtn_plus);

        //다이얼로그 생성
        AlertDialog alertDialog = builder.create();

        //팝업의 색있는 일정 누르면 트래커 색 변경
        view.findViewById(R.id.imgbtn_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddDialog();
            }
        });
        view.findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn.setBackgroundResource(R.drawable.dialog_button);
                sBtn.setText("외출 준비");
                alertDialog.dismiss();
            }
        });
        view.findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn.setBackgroundResource(R.drawable.dialog_button2);
                sBtn.setText("토익공부");
                alertDialog.dismiss();
            }
        });
        view.findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn.setBackgroundResource(R.drawable.dialog_button3);
                sBtn.setText("LUNCH");
                alertDialog.dismiss();
            }
        });
        view.findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn.setBackgroundResource(R.drawable.dialog_button4);
                sBtn.setText("책 읽기");
                alertDialog.dismiss();
            }
        });
        view.findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sBtn.setBackgroundResource(R.drawable.dialog_button);
                sBtn.setText("BREAKFAST");
                alertDialog.dismiss();
            }
        });

        if(alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }

        alertDialog.show();
    }
    private void showAddDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this
                , R.style.AlertDialogTheme);

        View view = LayoutInflater.from(MainActivity.this).inflate(
                R.layout.dialog_add,
                (LinearLayout)findViewById(R.id.dialog_addtime));

        //다이얼로그 텍스트 설정
        builder.setView(view);
        /*((TextView)view.findViewById(R.id.dialog_title1)).setText("시간 기록");
        ((Button)view.findViewById(R.id.btn1)).setText("    외출준비    ");
        ((Button)view.findViewById(R.id.btn2)).setText("    토익공부    ");
        ((Button)view.findViewById(R.id.btn3)).setText("    LUNCH    ");
        ((Button)view.findViewById(R.id.btn4)).setText("    책 읽기    ");
        ((Button)view.findViewById(R.id.btn5)).setText("    BREAKFAST    ");
        view.findViewById(R.id.imgbtn_plus);*/

        //다이얼로그 생성
        AlertDialog alertDialog = builder.create();

        if(alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }

        alertDialog.show();
    }

}
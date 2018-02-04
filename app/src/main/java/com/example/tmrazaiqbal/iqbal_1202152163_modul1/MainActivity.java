package com.example.tmrazaiqbal.iqbal_1202152163_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE =
            "com.example.tmrazaiqbal.com.extra.MESSAGE";

    private EditText mMessageEditText;
    public int uang = 65500;
    private int abnormalNasiuduk = 30000;
    private int eatbusNasiuduk = 50000;
    private int total;
    private EditText mMenu;
    private EditText mPorsi;
    private Button mIniAbnormal;
    private Button mIniEatbus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMenu = (EditText) findViewById(R.id.tv_menu);
        mPorsi = (EditText) findViewById(R.id.tv_porsi);
        mIniAbnormal = (Button)findViewById(R.id.abnormal);
        mIniEatbus = (Button)findViewById(R.id.button);

    }

    public void klikEatbus(View view) {
        Log.d(LOG_TAG, "Button clicked");

        int porsi = Integer.parseInt(mPorsi.getText().toString()) ;
        String menu = mMenu.getText().toString();

        total = porsi * eatbusNasiuduk;
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("porsi", porsi);
        intent.putExtra("menu", menu);
        intent.putExtra("total", total);
        intent.putExtra("uang", uang);
        intent.putExtra("resto", "Eatbus");
        startActivity(intent);
    }

    public void klikAbnormal(View view) {
        Log.d(LOG_TAG, "Button clicked");

        int porsi = Integer.parseInt(mPorsi.getText().toString()) ;
        String menu = mMenu.getText().toString();

        total = porsi * abnormalNasiuduk;
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("porsi", porsi);
        intent.putExtra("menu", menu);
        intent.putExtra("total", total);
        intent.putExtra("uang", uang);
        intent.putExtra("resto", "Abnormal");
        startActivity(intent);
    }


}

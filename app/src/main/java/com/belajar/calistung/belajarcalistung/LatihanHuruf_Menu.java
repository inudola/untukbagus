package com.belajar.calistung.belajarcalistung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class LatihanHuruf_Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_latihan_huruf);
    }




    public void bukamengenalangka(View view){
        Intent intent = new Intent(LatihanHuruf_Menu.this, BelajarHitung.class);
        startActivity(intent);
    }

    public void bukabelajar(View view) {
        Intent intent = new Intent(LatihanHuruf_Menu.this, BelajarBaca.class);
        startActivity(intent);
    }
    public void kembali (View view){
        Intent intent = new Intent (LatihanHuruf_Menu.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

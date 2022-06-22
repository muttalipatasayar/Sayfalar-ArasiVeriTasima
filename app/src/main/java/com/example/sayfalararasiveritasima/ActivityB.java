package com.example.sayfalararasiveritasima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        String gelenMesaj= getIntent().getStringExtra("Mesaj");
        int gelenYas=getIntent().getIntExtra("Yas",0);
        double gelenBoy=getIntent().getDoubleExtra("Boy",0.0);

        Kisiler gelenKisi= (Kisiler)getIntent().getSerializableExtra("nesne");
        Log.e("Gelen Mesaj",gelenMesaj);
        Log.e("Gelen Yas",String.valueOf(gelenYas));
        Log.e("Gelen Boy", String.valueOf(gelenBoy));

        Log.e("Gelen TCNo", String.valueOf(gelenKisi.getTcNo()));
        Log.e("Gelen Isim", gelenKisi.getIsim());
        Log.e("Gelen Kisi Boy",String.valueOf(gelenKisi.getBoy()));
    }
}
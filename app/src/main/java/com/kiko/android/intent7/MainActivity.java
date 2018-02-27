package com.kiko.android.intent7;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);


        final MediaPlayer tresemum = MediaPlayer.create(this, R.raw.xique);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tresemum.start();
                abrepg2();
            }
        });


    }
    private void abrepg2(){
        Intent cartinha = new Intent(this, tela2.class);
        startActivity(cartinha);
    }
}

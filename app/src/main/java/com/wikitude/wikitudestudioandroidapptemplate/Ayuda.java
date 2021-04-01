package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ayuda extends AppCompatActivity implements View.OnClickListener {
    Button  btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda2);
        btnregresar = (Button) findViewById(R.id.btn_regresar);
        btnregresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnregresar){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
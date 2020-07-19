package com.example.contadorpingpong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TableroActivity extends AppCompatActivity {
    public TextView marcador1, marcador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);
        ini();
    }

    public void ini(){
     marcador1=(TextView) findViewById(R.id.textView3);
     marcador2=(TextView) findViewById(R.id.textView);
     marcador1.setText(m1);
     marcador2.setText(m2);

     Context context= this;
     SharedPreferences sharedp
    }
    public void sumar(View view){
        switch (view.getId()){
            case R.id.suma1:
                
                break;
            case R.id.suma2:

                break;
        }
    }

    public void restar(View view){
        switch (view.getId()){
            case R.id.resta1:

                break;
            case R.id.resta2:

                break;
        }
    }
}
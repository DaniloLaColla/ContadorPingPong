package com.example.contadorpingpong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Seleccion(View view){
        Intent siguiente=new Intent(this, TableroActivity.class);
        String enfrentamiento;
        switch (view.getId()){
            case R.id.b_danilomiguel:
                enfrentamiento= "danilomiguel";
                siguiente.putExtra("txt", enfrentamiento);
                startActivity(siguiente);
                break;
            case R.id.b_miguelsantino:
                enfrentamiento= "miguelsantino";
                siguiente.putExtra("txt", enfrentamiento);
                startActivity(siguiente);
                break;
            case R.id.b_danilosantino:
                enfrentamiento= "danilosantino";
                siguiente.putExtra("txt", enfrentamiento);
                startActivity(siguiente);
                break;
        }
    }
}
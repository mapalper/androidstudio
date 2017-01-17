package com.example.alumnado_pc01.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etUserName;
    private EditText etPassword;
    private Button btnAceptar;
    private Button btnCancelar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserName = (EditText)findViewById(R.id.etUserName);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnAceptar = (Button)findViewById(R.id.btnAceptar);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
 

        //Limpiar los botones
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etUserName.setText("");
                etPassword.setText("");
            }
        });

    }
}

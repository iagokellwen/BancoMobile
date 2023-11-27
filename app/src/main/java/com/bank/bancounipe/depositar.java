package com.bank.bancounipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class depositar extends AppCompatActivity {
    EditText et_depositar;
    Button btn_depositar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depositar);
        et_depositar = findViewById(R.id.et_depositar);
        btn_depositar = findViewById(R.id.btn_depositar);

    }

    public void voltar_main(View v) {
        Intent it_main = new Intent(this, MainActivity.class);
        startActivity(it_main);
        //setContentView(R.layout.activity_pix);
    }

    public void depositar(View v) {
        Intent it_depositar = new Intent(this, MainActivity.class);
        double dep = Double.parseDouble(et_depositar.getText().toString());
        Intent it=getIntent();
        double saldoAtual =it.getDoubleExtra("saldo",0);
        double somaSaldo = dep + saldoAtual;
        it_depositar.putExtra("real",somaSaldo);
        Toast.makeText(getApplicationContext(),"Valor depositado!",Toast.LENGTH_LONG).show();
        startActivity(it_depositar);
    }
}
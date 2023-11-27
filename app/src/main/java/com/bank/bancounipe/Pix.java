package com.bank.bancounipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pix extends AppCompatActivity {

    EditText et_pix;
    Button btn_pix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pix);
        et_pix = findViewById(R.id.et_pix);
        btn_pix = findViewById(R.id.btn_pix);
    }

    public void voltar_main(View v){
        Intent it_main = new Intent(this, MainActivity.class);
        startActivity(it_main);
        //setContentView(R.layout.activity_pix);
    }

    public void pix(View v){

        Intent it_pix = new Intent(this, MainActivity.class);
        double valor_pix = Double.parseDouble(et_pix.getText().toString());
        Intent it=getIntent();
        double saldoAtual = it.getDoubleExtra("saldo",0);
        /*if (valor_pix == 0){
            Toast.makeText(getApplicationContext(),"Valor inválido!",Toast.LENGTH_LONG).show();

        }*/
        if (valor_pix > saldoAtual){
            Toast.makeText(getApplicationContext(),"Saldo insuficiente! Valor disponível: "+saldoAtual,Toast.LENGTH_LONG) .show();

        }else {
            double somaSaldo = saldoAtual - valor_pix;
            it_pix.putExtra("real",somaSaldo);
            startActivity(it_pix);
            Toast.makeText(getApplicationContext(),"Pix realizado com sucesso!",Toast.LENGTH_LONG).show();

        }
    }
}
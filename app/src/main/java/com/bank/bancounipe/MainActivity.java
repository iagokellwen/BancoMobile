package com.bank.bancounipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent it=getIntent();
        double valorReal=it.getDoubleExtra("real",0);

        TextView tv=findViewById(R.id.tv_saldo);
        tv.setText(""+valorReal);



    }
    public void Pix(View v){
        Intent it_pix = new Intent(this, Pix.class);
        TextView tv=findViewById(R.id.tv_saldo);
        double saldo = Double.parseDouble(tv.getText().toString());
        it_pix.putExtra("saldo",saldo);
        startActivity(it_pix);
        //setContentView(R.layout.activity_pix);
    }

    public void Depositar(View v){
        Intent it_depositar = new Intent(this, depositar.class);
        TextView tv=findViewById(R.id.tv_saldo);
        double saldo = Double.parseDouble(tv.getText().toString());
        it_depositar.putExtra("saldo",saldo);
        startActivity(it_depositar);
        //setContentView(R.layout.activity_pix);
    }



}

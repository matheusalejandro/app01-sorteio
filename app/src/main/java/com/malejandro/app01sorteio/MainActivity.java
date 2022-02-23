package com.malejandro.app01sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //declarar todos os campos alteraveis antes
    private TextView textoDoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //apontar para os campos
        textoDoResultado = findViewById(R.id.textResultado);
    }

    //fazer os processamentos abaixo
    public void cliqueButtonRealizarSorteio(View view) {
        int numeroSorteado = new Random().nextInt(11);

        textoDoResultado.setText("O número selecionado: " + numeroSorteado);
    }

}
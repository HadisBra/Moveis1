package com.example.guilhermealexandrepereira_lima;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Animal_Status extends AppCompatActivity {

    private ImageView imageViewAnimalStatus;
    private TextView textViewNomeAnimalStatus;
    private TextView textViewPalavraAnimalStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_status);

        imageViewAnimalStatus = findViewById(R.id.imageViewAnimalStatus);
        textViewNomeAnimalStatus = findViewById(R.id.textViewNomeAnimalStatus);
        textViewPalavraAnimalStatus = findViewById(R.id.textViewPalavraAnimalStatus);

        // Get data from intent
        String nome = getIntent().getStringExtra("nome");
        int imagem = getIntent().getIntExtra("imagem", 0);
        String palavra = getIntent().getStringExtra("palavra");

        // Set data to views
        textViewNomeAnimalStatus.setText(nome);
        imageViewAnimalStatus.setImageResource(imagem);
        textViewPalavraAnimalStatus.setText(palavra);
    }
}
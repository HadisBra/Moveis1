package com.example.guilhermealexandrepereira_lima;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SelecionaAnimaisActivity extends AppCompatActivity {
    private ListView listViewAnimaisSelecionados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleciona_animais);

        listViewAnimaisSelecionados = findViewById(R.id.listViewAnimaisSelecionados);

        // Recebe a lista de animais selecionados do Intent
        ArrayList<Animal> animaisSelecionados = (ArrayList<Animal>) getIntent().getSerializableExtra("animais");

        // Configura o adaptador personalizado para exibir a lista de animais selecionados no ListView
        AnimalAdapter adapter = new AnimalAdapter(this, animaisSelecionados);
        listViewAnimaisSelecionados.setAdapter(adapter);
    }
}
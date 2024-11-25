package com.example.guilhermealexandrepereira_lima;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guilhermealexandrepereiralimaapp.Animal_Adapter;

import java.util.ArrayList;

public class PaginaInicial extends AppCompatActivity {

    private ListView listViewAnimais;
    private ArrayList<Animal> animais;
    private Animal_Adapter adapter;
    //  private PoderHabilidadeAdapter adapter1;
    private Button buttonAnimais, buttonCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicial);

        listViewAnimais = findViewById(R.id.listViewAnimais);

        animais = new ArrayList<>();
        // Add animals to the list here
        animais.add(new Animal(getString(R.string.rato), R.drawable.rato_signo_zodiaco_chines, getString(R.string.palavraRato)));
        animais.add(new Animal(getString(R.string.bufalo), R.drawable.boi_zodiaco_signo_chines, getString(R.string.palavraBufalo)));
        animais.add(new Animal(getString(R.string.tigre), R.drawable.signo_zodiaco_tigre, getString(R.string.palavraTigre)));
        animais.add(new Animal(getString(R.string.coelho), R.drawable.coelho_signo_chines_zodiaco, getString(R.string.palavraCoelho)));
        animais.add(new Animal(getString(R.string.dragao), R.drawable.signo_zodiaco_dragao, getString(R.string.palavraDragao)));
        animais.add(new Animal(getString(R.string.serpente), R.drawable.serpente_cobra_signo_chines, getString(R.string.plavraSerpente)));
        animais.add(new Animal(getString(R.string.cavalo), R.drawable.cavalo_signo_zodiaco, getString(R.string.palavraCavalo)));
        animais.add(new Animal(getString(R.string.cabra), R.drawable.cabra_signo_chines, getString(R.string.palavraCabra)));
        animais.add(new Animal(getString(R.string.macaco), R.drawable.signo_chines_macaco_personalidade, getString(R.string.palavraMacaco)));
        animais.add(new Animal(getString(R.string.galo), R.drawable.galo_signo_chines, getString(R.string.palavraGalo)));
        animais.add(new Animal(getString(R.string.cao), R.drawable.cachorro_signo_zodiaco_chines, getString(R.string.palavraCao)));
        animais.add(new Animal(getString(R.string.javali), R.drawable.javali_signo_chines_zodiaco, getString(R.string.palavraJavali)));

        adapter = new Animal_Adapter(this, animais);
        listViewAnimais.setAdapter(adapter);

        listViewAnimais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animal animal = (Animal) parent.getItemAtPosition(position);
                Intent intent = new Intent(PaginaInicial.this, Animal_Status.class);
                intent.putExtra("nome", animal.getNomeAnimal());
                intent.putExtra("imagem", animal.getImagem());
                intent.putExtra("palavra", animal.getPalavraAnimal());
                startActivity(intent);
            }
        });


        buttonAnimais = findViewById(R.id.buttonAnimais);
        buttonAnimais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAnimais();
            }
        });
        buttonCadastrar = findViewById(R.id.buttonCadastro);
    buttonCadastrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(PaginaInicial.this, SelecionaAnimaisActivity.class);
        intent.putExtra("animais", animais);
        startActivity(intent);
    }
});


    }

    private void showDialogAnimais() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_animais, null);
        ListView listViewDialogAnimais = dialogView.findViewById(R.id.listViewDialogAnimais);

        PoderHabilidadeAdapter adapter1 = new PoderHabilidadeAdapter(this, animais);
        listViewDialogAnimais.setAdapter(adapter1);

        builder.setView(dialogView);
        builder.setTitle("Animais e seus Atributos");
        builder.setPositiveButton("OK", null);
        builder.create().show();

    }
}
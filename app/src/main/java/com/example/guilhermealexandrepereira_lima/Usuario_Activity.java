package com.example.guilhermealexandrepereira_lima;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Usuario_Activity extends AppCompatActivity {
    private EditText editTextNome, editTextDia, editTextMes, editTextAno, editTextValor;
    private Button buttonCadastrar;
    private List<String> animais;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        editTextNome = findViewById(R.id.editTextNome);
        editTextDia = findViewById(R.id.editTextDia);
        editTextMes = findViewById(R.id.editTextMes);
        editTextAno = findViewById(R.id.editTextAno);
        editTextValor = findViewById(R.id.editTextValor);
        buttonCadastrar = findViewById(R.id.buttonSubmit);

        // Recebe a lista de animais do Intent
        animais = getIntent().getStringArrayListExtra("animais");
        if (animais == null) {
            animais = new ArrayList<>(); // Initialize to avoid NullPointerException
        }

// Assuming PoderHabilidade requires two String arguments, for example, "animalType" and "animalName"
buttonCadastrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String nome = editTextNome.getText().toString();
        String dia = editTextDia.getText().toString();
        String mes = editTextMes.getText().toString();
        String ano = editTextAno.getText().toString();
        String valorStr = editTextValor.getText().toString();

        int valor = Integer.parseInt(valorStr);
        if (valor < 1 || valor > 12) {
            Toast.makeText(Usuario_Activity.this, "Valor deve ser entre 1 e 12", Toast.LENGTH_SHORT).show();
            return;
        }

        List<String> selecionados = new ArrayList<>();
        Random random = new Random();
        while (selecionados.size() < valor) {
            String animal = animais.get(random.nextInt(animais.size()));
            if (!selecionados.contains(animal)) {
                selecionados.add(animal);
            }
        }




        Intent intent = new Intent(Usuario_Activity.this, SelecionaAnimaisActivity.class);
        intent.putStringArrayListExtra("animais_selecionados", new ArrayList<>(selecionados));
        startActivity(intent);
    }
});
    }
}
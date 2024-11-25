package com.example.guilhermealexandrepereira_lima;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.ArrayList;

public class PoderHabilidadeAdapter extends ArrayAdapter<Animal> {

    public PoderHabilidadeAdapter(Context context, ArrayList<Animal> animais) {
        super(context, 0, animais);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.poder_habilidade, parent, false);
        }

        Animal animal = getItem(position);

        ImageView imageViewAnimal = convertView.findViewById(R.id.imageViewAnimal);
        TextView textViewNomeAnimal = convertView.findViewById(R.id.textViewNomeAnimal);
        TextView textViewValorPalavra = convertView.findViewById(R.id.textViewValorPalavra);
        TextView textViewValorNome = convertView.findViewById(R.id.textViewValorNome);
        TextView textViewPoderAnimal = convertView.findViewById(R.id.textViewPoderAnimal);

        if (animal != null) {
            imageViewAnimal.setImageResource(animal.getImagem());
            textViewNomeAnimal.setText(animal.getNomeAnimal());

            PoderHabilidade p = new PoderHabilidade(animal.getNomeAnimal(), animal.getPalavraAnimal());
            int valorNome = p.ValorNome();
            int valorPalavra = p.ValorPalavra();
            int valorTotal = p.ValorTotal();

            textViewValorNome.setText("Valor Nome: " + valorNome);
            textViewValorPalavra.setText("Valor Palavra: " + valorPalavra);
            textViewPoderAnimal.setText("Poder: " + valorTotal);

        }

        return convertView;
    }
}
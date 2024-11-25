package com.example.guilhermealexandrepereiralimaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.guilhermealexandrepereira_lima.Animal;
import com.example.guilhermealexandrepereira_lima.R;

import java.util.ArrayList;

public class Animal_Adapter extends ArrayAdapter<Animal> {
    public Animal_Adapter(Context context, ArrayList<Animal> animais) {
        super(context, 0, animais);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lista_de_animais, parent, false);
        }

        Animal animal = getItem(position);

        ImageView imageViewAnimal = convertView.findViewById(R.id.imageViewAnimal);
        TextView textViewNomeAnimal = convertView.findViewById(R.id.textViewNomeAnimal);

        if (animal != null) {
            imageViewAnimal.setImageResource(animal.getImagem());
            textViewNomeAnimal.setText(animal.getNomeAnimal());
        }

        return convertView;
    }
}
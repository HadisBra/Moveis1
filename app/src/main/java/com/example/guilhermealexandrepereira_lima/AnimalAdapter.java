package com.example.guilhermealexandrepereira_lima;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {
    private Context context;
    private List<Animal> animais;

    public AnimalAdapter(Context context, List<Animal> animais) {
        this.context = context;
        this.animais = animais;
    }

    @Override
    public int getCount() {
        return animais.size();
    }

    @Override
    public Object getItem(int position) {
        return animais.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_animal, parent, false);
        }

        Animal animal = animais.get(position);

        TextView nomeTextView = convertView.findViewById(R.id.nomeAnimal);
        TextView poderTextView = convertView.findViewById(R.id.poderAnimal);

        nomeTextView.setText(animal.getNomeAnimal());
        poderTextView.setText(String.valueOf(animal.getPoder().ValorTotal()));

        return convertView;
    }
}
package com.example.practica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context context;
    private ArrayList<Entidad> listItems;

    public Adaptador(Context context, ArrayList<Entidad> listItems) {
        this.context = context;
        this.listItems = listItems;
    }
    //indica allistview cuantos datos va a cargar
    @Override
    public int getCount() {
        return listItems.size();
    }
    //devuelve de listItem la posicion
    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Entidad Item = (Entidad) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        TextView nroMaquina = (TextView) convertView.findViewById(R.id.nroMaquina);
        TextView parqueadero = (TextView) convertView.findViewById(R.id.parqueadero);

        nroMaquina.setText(Item.getNroMaquina());
        parqueadero.setText(Item.getParqueadero());

        return convertView;
    }
}

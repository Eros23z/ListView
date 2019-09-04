package com.example.listview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;

public class Adapter extends BaseAdapter {
    private static LayoutInflater inflater = null;
    Context contexto;
    int[] imagenes;
    int[] estrellas;

    public Adapter(Context contexto, int[] imagenes, int[] estrellas) {
        this.contexto = contexto;
        this.imagenes = imagenes;
        this.estrellas = estrellas;
        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imagenes.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final View vista = inflater.inflate(R.layout.item,null);
        ImageView imagen = (ImageView)vista.findViewById(R.id.imagenItem);
        RatingBar rating = (RatingBar)vista.findViewById(R.id.ratingItem);
        imagen.setImageResource(imagenes[position]);
        rating.setProgress(estrellas[position]);
        return vista;
    }

}

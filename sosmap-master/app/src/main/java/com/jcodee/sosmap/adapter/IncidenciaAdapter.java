package com.jcodee.sosmap.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcodee.sosmap.R;
import com.jcodee.sosmap.model.Elemento;

import java.util.ArrayList;



public class IncidenciaAdapter  extends BaseAdapter{
    private ArrayList<Elemento> lista;
    private Context context;
    private LayoutInflater layoutInflater;

    public IncidenciaAdapter(Context context, ArrayList<Elemento> lista) {
        this.context = context;
        this.lista = lista;
    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vista = layoutInflater.inflate(R.layout.item_lista, viewGroup, false);
        ImageView imageView = (ImageView)vista.findViewById(R.id.imvIcon);
        TextView textView = (TextView)vista.findViewById(R.id.tvTexto);

        imageView.setImageResource(lista.get(i).getImagen());
        textView.setText(lista.get(i).getTexto());

        return vista;
    }
}

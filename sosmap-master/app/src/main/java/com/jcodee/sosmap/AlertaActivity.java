package com.jcodee.sosmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlertaActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ivAlerta)
    ImageView ivAlerta;
    @BindView(R.id.ivMap)
    ImageView ivMap;
    @BindView(R.id.svBusqueda)
    SearchView svBusqueda;
    @BindView(R.id.ivBus)
    ImageView ivBus;
    @BindView(R.id.spRegion)
    Spinner spRegion;
    @BindView(R.id.spPuesto)
    Spinner spPuesto;
    @BindView(R.id.imageView3)
    ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerta);
        ButterKnife.bind(this);
        toolbar.setTitle(getResources().getString(R.string.app_name_Alerta));

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Region,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spRegion.setAdapter(adapter);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.Puesto,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPuesto.setAdapter(adapter1);
    }
}

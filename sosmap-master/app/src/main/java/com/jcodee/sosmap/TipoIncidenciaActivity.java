package com.jcodee.sosmap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jcodee.sosmap.adapter.IncidenciaAdapter;
import com.jcodee.sosmap.model.Elemento;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TipoIncidenciaActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.listView)
    ListView listView;
    private ArrayList<Elemento> arrayList = null;
    private IncidenciaAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_incidencia);
        ButterKnife.bind(this);

        toolbar.setTitle(getResources().getString(R.string.app_name_tipo));
        arrayList = new ArrayList<>();

        cargarlista();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(TipoIncidenciaActivity.this, AlertaActivity.class);
                intent.putExtra("Incidencia", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

    }

    private void cargarlista() {

        arrayList.add(new Elemento(R.drawable.iconasaltos, "Asaltos"));
        arrayList.add(new Elemento(R.drawable.iconomaltrato, "Trata de Personas"));
        arrayList.add(new Elemento(R.drawable.iconobebidas, "Cosumo de Bebidas"));
        arrayList.add(new Elemento(R.drawable.iconopandillaje, "Pandillaje"));
        arrayList.add(new Elemento(R.drawable.iconodrogadiccion, "Drogadiccion"));
        arrayList.add(new Elemento(R.drawable.iconocomerce, "Comercio Ambulatorio"));


        adapter = new IncidenciaAdapter(this, arrayList);
        listView.setAdapter(adapter);
    }


}

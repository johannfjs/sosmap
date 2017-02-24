package com.jcodee.sosmap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBar actionBar;
    TextView textView;
    @BindView(R.id.imbcomisaria)
    ImageButton imbcomisaria;
    @BindView(R.id.imbbombero)
    ImageButton imbbombero;
    @BindView(R.id.imbemergencia)
    ImageButton imbemergencia;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar.setTitle(getResources().getString(R.string.app_name_Menu));


    }

    @OnClick({R.id.imbcomisaria, R.id.imbbombero, R.id.imbemergencia})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imbcomisaria:
                Intent intent = new Intent(MainActivity.this, TipoIncidenciaActivity.class);
                startActivity(intent);
                break;
            case R.id.imbbombero:
                break;
            case R.id.imbemergencia:
                break;
        }
    }
}

package com.luisadrian.wonderfulplaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IMainActivity {

    RecyclerView recyclerViewPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciando como objeto el RecyclerView
        recyclerViewPlaces=(RecyclerView) findViewById(R.id.recyclerMainPlaces);

        //Inicializando métodos
        crearAdaptador();
        inicializarAdaptador();
        inicializarGridLayoutManager();

    }

    public ArrayList<PlacePojo> definirLugaresInteres(){
        //Declarando/Instanciando ArrayList que contendrá los objetos del POJO de lugares
        ArrayList<PlacePojo> lugaresInteres=new ArrayList<PlacePojo>();

        //Añadiendo objetos en localidades de memoria (indices) del Arraylist
        lugaresInteres.add(new PlacePojo(R.drawable.recurso_wp_iglesia_valladolid,getResources().getString(R.string.iglesia_valladolid),getResources().getString(R.string.ciudad_valladolid),getResources().getString(R.string.descripcion_iglesia_valladolid)));
        lugaresInteres.add(new PlacePojo(R.drawable.recurso_wp_centro_campeche,getResources().getString(R.string.centro_campeche),getResources().getString(R.string.ciudad_campeche),getResources().getString(R.string.descripcion_centro_campeche)));
        lugaresInteres.add(new PlacePojo(R.drawable.recurso_wp_monumento_merida,getResources().getString(R.string.monumento_patria_merida),getResources().getString(R.string.ciudad_merida),getResources().getString(R.string.descripcion_monumento_merida)));
        lugaresInteres.add(new PlacePojo(R.drawable.recurso_wp_museo_maya_merida,getResources().getString(R.string.museo_maya_merida),getResources().getString(R.string.ciudad_merida),getResources().getString(R.string.descripcion_museo_maya_merida)));

        return lugaresInteres;
    }

    @Override
    public WonderfulPlacesAdaptador crearAdaptador() {
        WonderfulPlacesAdaptador adaptadorLugares=new WonderfulPlacesAdaptador(definirLugaresInteres(),this);
        return adaptadorLugares;
    }

    @Override
    public void inicializarAdaptador() {
        recyclerViewPlaces.setAdapter(crearAdaptador());
    }

    @Override
    public void inicializarGridLayoutManager() {
        GridLayoutManager vistaGridRecycler=new GridLayoutManager(this,2);
        recyclerViewPlaces.setLayoutManager(vistaGridRecycler);
    }
}

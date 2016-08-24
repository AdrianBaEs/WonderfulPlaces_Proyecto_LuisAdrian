package com.luisadrian.wonderfulplaces;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        extras=getIntent().getExtras();
        int clave=extras.getInt("clave");

        switch (clave){
            case 1:
                LatLng iglesiaValladolid = new LatLng(20.689089494709272, -88.20192748941044);
                mMap.addMarker(new MarkerOptions().position(iglesiaValladolid).title("Iglesia de San Gervasio").snippet("Iglesia ubicada en el centro histórico de Valladolid"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(iglesiaValladolid,16));
                break;
            case 2:
                LatLng centroCampeche = new LatLng(19.83057823689566, -90.54481694999998);
                mMap.addMarker(new MarkerOptions().position(centroCampeche).title("Centro histórico de San Francisco de Campeche").snippet("Ubicado en el centro de la ciudad"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centroCampeche,16));
                break;
            case 3:
                LatLng monumentoMerida = new LatLng(20.989718692265573, -89.6168544423279);
                mMap.addMarker(new MarkerOptions().position(monumentoMerida).title("Monumento a la Patria").snippet("Monumento ubicado en la avenida paseo de Montejo"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(monumentoMerida,16));
                break;
            case 4:
                LatLng museoMayaMerida = new LatLng(21.03506491018617, -89.62851186259614);
                mMap.addMarker(new MarkerOptions().position(museoMayaMerida).title("Museo del Mundo Maya").snippet("Museo más importante de la cultura Maya"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(museoMayaMerida,16));
                break;
        }

    }
}

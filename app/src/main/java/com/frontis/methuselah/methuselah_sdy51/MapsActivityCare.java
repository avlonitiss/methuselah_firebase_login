package com.frontis.methuselah.methuselah_sdy51;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.shiva.try1.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityCare extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapscare);
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

        // Προσδιορισμός σημείων φροντίδας και μετακίνηση χάρτη στο σημείο
        float zoomLevel = (float) 13.0;
        LatLng myLocation = new LatLng(37.98, 23.72);
        LatLng ilisia = new LatLng(37.982, 23.760);
        LatLng nursing = new LatLng(37.993, 23.766);
        LatLng kallisto = new LatLng(38.021, 23.788);

        mMap.addMarker(new MarkerOptions().position(myLocation).title("Είμαι εδώ"));
        mMap.addMarker(new MarkerOptions().position(ilisia).title("ILISIA CARE"));
        mMap.addMarker(new MarkerOptions().position(nursing).title("NURSING HOME"));
        mMap.addMarker(new MarkerOptions().position(kallisto).title("ΚΑΛΛΙΣΤΩ"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation,zoomLevel));
    }
}

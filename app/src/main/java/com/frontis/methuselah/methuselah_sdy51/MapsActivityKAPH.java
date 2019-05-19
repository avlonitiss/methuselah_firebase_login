package com.frontis.methuselah.methuselah_sdy51;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.example.shiva.try1.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityKAPH extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private MapView mMapView;
    private View mView;

    public MapsActivityKAPH(){
        
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapskaph);
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

        // Προσδιορισμός σημείων ΚΑΠΗ και μετακίνηση χάρτη στο σημείο
        float zoomLevel = (float) 15.0;
        LatLng myLocation = new LatLng(37.999, 23.736);
        LatLng panormou = new LatLng(37.988, 23.758);
        LatLng kypseli = new LatLng(38.007, 23.740);
        LatLng sepolia = new LatLng(38.011, 23.720);
        LatLng grava = new LatLng(38.019, 23.740);
        mMap.addMarker(new MarkerOptions().position(myLocation).title("Είμαι εδώ"));
        mMap.addMarker(new MarkerOptions().position(panormou).title("Λέσχη Φιλίας Πανόρμου"));
        mMap.addMarker(new MarkerOptions().position(kypseli).title("Λέσχη Φιλίας Κυψέλης"));
        mMap.addMarker(new MarkerOptions().position(sepolia).title("Λέσχη Φιλίας Σεπολίων"));
        mMap.addMarker(new MarkerOptions().position(grava).title("Λέσχη Φιλίας Γκράβας"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation,zoomLevel));
    }
}

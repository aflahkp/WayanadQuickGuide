package quick.wayanad.com.wayanadquickguide;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

;

public class AtaGlance extends AppCompatActivity implements OnMapReadyCallback {

    private double lat=11.6693103,lon=75.9561205;

    private GoogleMap mMap;



    public AtaGlance() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        SupportMapFragment mapFragment= (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }




    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng banasura = new LatLng(11.6692574, 75.9565484);
        mMap.addMarker(new MarkerOptions().position(banasura).title("Banasura Sagar Dam"));

        LatLng pookode = new LatLng( 11.5421979,76.0262077);
        mMap.addMarker(new MarkerOptions().position(pookode).title("Pookode Lake"));

        LatLng kuruva = new LatLng(11.8216722,76.0900333);
        mMap.addMarker(new MarkerOptions().position(kuruva).title("Kuruva Islands"));

        LatLng chembra = new LatLng(11.5472706,76.0801667);
        mMap.addMarker(new MarkerOptions().position(chembra).title("Chembra Peak"));

        LatLng kalpetta = new LatLng(11.6161665,76.0507957);
        mMap.addMarker(new MarkerOptions().position(kalpetta).title("Kalpetta")).setVisible(true);


        //  mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kalpetta, 10.0f));

    }

}

package quick.wayanad.com.wayanadquickguide;


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

public class ViewOnMap extends AppCompatActivity implements OnMapReadyCallback {

    private double lat=11.6693103,lon=75.9561205;

    private GoogleMap mMap;



    public ViewOnMap() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        SupportMapFragment mapFragment= (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        TextView tv=(TextView)findViewById(R.id.tvhead);
        tv.setVisibility(View.GONE);
        lat=getIntent().getDoubleExtra("lat",0);
        lon=getIntent().getDoubleExtra("lon",0);

    }




    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng dest = new LatLng(lat,lon);
        mMap.addMarker(new MarkerOptions().position(dest).title("Banasura Sagar Dam"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dest, 11.0f));

    }

}

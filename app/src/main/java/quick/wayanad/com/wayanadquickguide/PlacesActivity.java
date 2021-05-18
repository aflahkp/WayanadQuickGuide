package quick.wayanad.com.wayanadquickguide;


import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
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

;import java.util.Locale;

public class PlacesActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {

    private double lat=11.6693103,lon=75.9561205;
    private int imgid=R.drawable.banasura;
    private String name="Destination",des="No description available!";
    android.support.design.widget.CollapsingToolbarLayout collapsingToolbarLayout;
    TextView description,view,navigate;
    private GoogleMap mMap;



    public PlacesActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_with_map);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        SupportMapFragment mapFragment= (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        lat=getIntent().getDoubleExtra("lat",0);
        lon=getIntent().getDoubleExtra("lon",0);
        name=getIntent().getStringExtra("name");
        imgid=getIntent().getIntExtra("imgid",0);
        int desid=getIntent().getIntExtra("des",R.string.banasura_des);
        des=getString(desid);


        collapsingToolbarLayout=(android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setBackgroundResource(imgid);
        collapsingToolbarLayout.setTitle(name);
        collapsingToolbarLayout.setCollapsedTitleTypeface(Typeface.SERIF);
        view=(TextView)findViewById(R.id.viewbut);
        navigate=(TextView)findViewById(R.id.navbut);
        view.setOnClickListener(this);
        navigate.setOnClickListener(this);
        description=(TextView)findViewById(R.id.destext);
        description.setText(des);

      //  this.name=savedInstanceState.getString("name");
    }




    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng dest = new LatLng(lat,lon);
        mMap.addMarker(new MarkerOptions().position(dest).title(name));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(dest, 12.0f));
    }

    @Override
    public void onClick(View v) {

        Intent intent=new Intent(PlacesActivity.this,ViewOnMap.class);

        switch (v.getId()){
            case R.id.viewbut:
                intent.putExtra("lat",lat);
                intent.putExtra("lon",lon);
                startActivity(intent);
                break;
            case R.id.navbut:
                String uri=String.format(Locale.ENGLISH,"http://maps.google.com/maps?daddr=%f,%f (%s)",lat,lon,name);
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
                break;
        }

    }
}

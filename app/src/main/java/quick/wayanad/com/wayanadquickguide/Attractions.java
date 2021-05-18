package quick.wayanad.com.wayanadquickguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Attractions extends AppCompatActivity implements View.OnClickListener{

    private String name,des="No description available";
    private double lat,lon;
    private int imgid=R.drawable.banasura,desid=R.string.banasura_des;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Attractions.this,PlacesActivity.class);

        switch (v.getId()){

            case R.id.button5:
                name="Banasura Sagar Dam";
                lat=11.6692574;
                lon=75.9565484;
                imgid=R.drawable.banasura;
                desid=R.string.banasura_des;
                intent.putExtra("imgid",imgid);
                intent.putExtra("lat",lat);
                intent.putExtra("lon",lon);
                intent.putExtra("name",name);
                intent.putExtra("des",desid);
                startActivity(intent);
                break;
            case R.id.button6:
                name="Kuruva Island";
                des=getString(R.string.kuruva_des);
               lat= 11.8216722;
                lon=76.0900333;
                imgid=R.drawable.kurva;
                desid=R.string.kuruva_des;
                intent.putExtra("imgid",imgid);
                intent.putExtra("lat",lat);
                intent.putExtra("lon",lon);
                intent.putExtra("name",name);
                intent.putExtra("des",desid);
                startActivity(intent);
                break;
            case R.id.button7:
                name="Chembra Peak";
                desid=R.string.chembra_des;
                des=getString(R.string.chembra_des);
                lat=11.5472706;
                lon=76.0801667;
                imgid=R.drawable.chembra;
                intent.putExtra("imgid",imgid);
                intent.putExtra("lat",lat);
                intent.putExtra("lon",lon);
                intent.putExtra("name",name);
                intent.putExtra("des",desid);
                startActivity(intent);
                break;
            case R.id.button8:
                name="Pookode Lake";
                des=getString(R.string.pookode_des);
                desid=R.string.pookode_des;
                lat=11.5421979;
                lon=76.0262077;
                imgid=R.drawable.pookode;
                intent.putExtra("imgid",imgid);
                intent.putExtra("lat",lat);
                intent.putExtra("lon",lon);
                intent.putExtra("name",name);
                intent.putExtra("des",desid);
                startActivity(intent);
                break;
            case R.id.button9:
                name="Pazhassi Thomb";
                des=getString(R.string.pazhassi_des);
                desid=R.string.pazhassi_des;
                lat=11.6161665;
                lon=76.0507957;
                imgid=R.drawable.pazhassi;
                intent.putExtra("imgid",imgid);
                intent.putExtra("lat",lat);
                intent.putExtra("lon",lon);
                intent.putExtra("name",name);
                intent.putExtra("des",desid);
                startActivity(intent);
                break;
            case R.id.button10:
                name="Edakkal Caves";
                des=getString(R.string.edakkal_des);
                desid=R.string.edakkal_des;
                lat=11.6161665;
                lon=76.0507957;
                imgid=R.drawable.edakkal;
                intent.putExtra("imgid",imgid);
                intent.putExtra("lat",lat);
                intent.putExtra("lon",lon);
                intent.putExtra("name",name);
                intent.putExtra("des",desid);
                startActivity(intent);
                break;
        }
    }
}

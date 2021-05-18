package quick.wayanad.com.wayanadquickguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button ataglance,attractions,arts,accomo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ataglance=(Button)findViewById(R.id.ataglance);
        attractions=(Button)findViewById(R.id.atts);
        arts=(Button)findViewById(R.id.arts);
        accomo=(Button)findViewById(R.id.accomo);
        ataglance.setOnClickListener(this);
        attractions.setOnClickListener(this);
        accomo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.ataglance:
                startActivity(new Intent(MainActivity.this,AtaGlance.class));
                break;
            case R.id.atts:
                startActivity(new Intent(MainActivity.this,Attractions.class));
                break;
            case R.id.accomo:
            Intent intent = new Intent(MainActivity.this, FbCommentsActivity.class);
            intent.putExtra("url", "http://www.androidhive.info/2016/06/android-firebase-integrate-analytics/");
            startActivity(intent);
                break;

        }

    }
}

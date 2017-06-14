package com.example.elsayedfahmy_pc.parcelableexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.marwatalaat.mal2.model.Country;

public class CountryDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);
        Country c = getIntent().getExtras().getParcelable("country");
        TextView txt = (TextView) findViewById(R.id.textView2);
        txt.setText(c.getName());
    }
}

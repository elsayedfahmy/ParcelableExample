package com.example.elsayedfahmy_pc.parcelableexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.marwatalaat.mal2.adapter.CountryAdapter;
import com.example.marwatalaat.mal2.model.Country;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Country item = (Country) parent.getItemAtPosition(position);
                Intent i = new Intent(MainActivity.this, CountryDetails.class);
                i.putExtra("country",item);
                startActivity(i);
            }
        });
        //datasource
        String names [] ={"Egypt","Oman"};
        int flages[]={R.drawable.eg , R.drawable.om};

        List<Country> countries = new ArrayList<>();
        for(int i =0 ; i<names.length ; i++){
            countries.add(new Country(flages[i],names[i]));
        }

        listView.setAdapter(new CountryAdapter(this,countries));




    }
}

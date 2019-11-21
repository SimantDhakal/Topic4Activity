package com.simant.topic4activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static String countries[] = {"Nepal", "India", "USA", "Thailand", "Australia"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listCountries);

        // set Adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(
          this,
          android.R.layout.simple_list_item_1,
            countries
        );
        listView.setAdapter(arrayAdapter);
    }
}

package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.LinearSystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        // Get a reference to the TextView
        TextView brands = findViewById(R.id.brands);
        // Get a reference to the Spinner
        Spinner color = findViewById(R.id.color);
        // Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        // get list of brands
        List<String> brandsList = expert.getBrands(beerType);
        // build a String using the values in the list
        StringBuilder brandsFormatted = new StringBuilder();

        for (String brand : brandsList)
            brandsFormatted.append(brand).append('\n');
        // Display selected item
        brands.setText(brandsFormatted);

    }
}
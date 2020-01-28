package edu.quinnipiac.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert beerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        //Reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Save the item selected in the spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Display the selected item

        List<String> brandsList = beerExpert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();

        for(String brand: brandsList){
            brandsFormatted.append(brand).append('\n');
        }
        //Display the beer!!
        brands.setText(brandsFormatted);

    }

}

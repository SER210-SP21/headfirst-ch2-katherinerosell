package edu.quinnipiac.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands (String color) {
        List<String> brands = new ArrayList<>();

        if (color.equals("light")){
            brands.add("GhostFish Suds");
            brands.add("Lime Light");
        }
        if (color.equals("amber")){
            brands.add("King Red-Rule");
            brands.add("Castle Siege");
        }
        if (color.equals("brown")){
            brands.add("Coffee Stout");
            brands.add("S'mores Dark Stout");
        }
        if (color.equals("dark")){
            brands.add("Guinness");
            brands.add("Friar's Brew");
        }
        return brands;

    }

}

package myParser;

import myParser.model.Model;
import myParser.model.Provider;

import java.util.Arrays;

/**
 * Created by Pc on 04.06.2017.
 */
public class Controller {
    Model model;

    public Controller(Model model) {
        if (model==null && model.provider.length == 0){
           throw new IllegalArgumentException();
        }else
        this.model = model;
    }
    public void onCitySelect(String cityName){
        model.selectCity(cityName);
    }
}

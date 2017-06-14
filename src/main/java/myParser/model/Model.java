package myParser.model;

import myParser.view.View;
import myParser.vo.Vacancy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 11.06.2017.
 */
public class Model {
    View view;
    public Provider [] provider;


    public Model(View view, Provider[] provider) {
        if(view==null && provider == null || provider.length == 0){
            throw new IllegalArgumentException();
        }else
        this.view = view;
        this.provider = provider;

    }
    public void selectCity(String city){
        List<Vacancy> newListVacancy = new ArrayList();
        for (int i = 0; i < provider.length; i++) {
            newListVacancy.addAll(provider[i].getJavaVacancies(city));
        }
        view.update(newListVacancy);
    }
}

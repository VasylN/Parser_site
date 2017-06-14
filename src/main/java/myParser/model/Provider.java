package myParser.model;

import myParser.vo.Vacancy;

import java.util.List;

/**
 * Created by Pc on 04.06.2017.
 */
public class Provider {
    Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Vacancy> getJavaVacancies(String searchString){
        return null;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}

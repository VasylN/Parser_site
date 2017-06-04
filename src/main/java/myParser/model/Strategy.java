package myParser.model;

import myParser.vo.Vacancy;

import java.util.List;

/**
 * Created by Pc on 04.06.2017.
 */
public interface Strategy {

   public abstract List<Vacancy> getVacancies(String searchString);



}

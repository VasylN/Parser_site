package myParser.view;

import myParser.model.Controller;
import myParser.vo.Vacancy;

import java.util.List;

/**
 * Created by Pc on 04.06.2017.
 */
public interface View {
    void update(List<Vacancy> vacancies);
    void setController(Controller controller);
}

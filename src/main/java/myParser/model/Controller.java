package myParser.model;

import java.util.Arrays;

/**
 * Created by Pc on 04.06.2017.
 */
public class Controller {
    private Provider[] providers;
    public Controller(Provider[] providers)  {

        this.providers = providers;
       if (providers == null || providers.length == 0){
           throw new IllegalArgumentException();

       }
    }

    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }
}

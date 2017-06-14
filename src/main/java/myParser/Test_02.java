package myParser;

/**
 * Created by Pc on 11.06.2017.
 */
public interface Test_02 {
    void a ();
    default void s1(){
        System.out.println(" ");
    }

    static void s2(){
        System.out.println(" ");
    }
}

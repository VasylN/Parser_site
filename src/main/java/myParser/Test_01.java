package myParser;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pc on 11.06.2017.
 */
public class Test_01 {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setA(1);
        person1.setB(3);
        Person person2 = new Person();
        person2.setA(3);
        person2.setB(1);
        System.out.println();
       // person1.equals(person2);
            if(person1.hashCode()==person2.hashCode()){
                System.out.println(true + " p1 = " + person1.hashCode() + " p2 = " + person2.hashCode());
            }else {
                System.out.println(false + " p1 = " + person1.hashCode() + " p2 = " + person2.hashCode());
            }

        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        System.out.println(set);

    }

    static class Person {
        int a;
        int b;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            if (a != person.a) return false;
            return b == person.b;

        }

//        @Override
//        public int hashCode() {
//            return a + b;
//        }

                @Override
        public int hashCode() {
            int result = a;
            result = 31 * result + b;
            return result;
        }
    }
}

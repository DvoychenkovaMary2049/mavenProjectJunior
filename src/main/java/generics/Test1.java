package generics;

import java.util.ArrayList;
public class Test1 {


        public static void main(String[] args) {
            ArrayList list = new ArrayList();

            list.add(1);
            list.add("fff");
            list.add(new Dog());

            list.get(0);

        }
    }

    class Dog{

    }


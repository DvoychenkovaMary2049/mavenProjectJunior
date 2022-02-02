package lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();

        a.add(4);
        a.add(5);
        a.add(6);
        a.add(6);

        HashSet<Integer> b = new HashSet<>();
        b.add(6);
        b.add(6);
        b.add(8);
        b.add(9);

        LinkedList<Integer> c = new LinkedList<>();
        c.add(6);
        c.add(6);
        c.add(8);
        c.add(9);


        CollectionUtilsImpl utils = new CollectionUtilsImpl();

//        Collection<Integer> union = utils.union(a, b);
//        System.out.println(union);
//        System.out.println(a);
//        System.out.println(b);

//        Collection <Integer> intersection = utils.intersection(a, c);
//        System.out.println(intersection);
//        System.out.println(a);
//        System.out.println(c);


//        Set <Integer> unionWithoutDuplicate = utils.unionWithoutDuplicate(a,b);
//        System.out.println(unionWithoutDuplicate);
//        System.out.println(a);
//        System.out.println(b);


        Set <Integer> intersectionWithoutDuplicate = utils.intersectionWithoutDuplicate(a,b);
        System.out.println(intersectionWithoutDuplicate);
        System.out.println(a);
        System.out.println(b);
//
//        Collection <Integer> difference = utils.difference(a,b);
//        System.out.println(difference);
//        System.out.println(a);
//        System.out.println(b);
    }
}

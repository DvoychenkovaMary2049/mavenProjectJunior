package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        LinkedList <String> linkedList = new LinkedList<>();

        long startArrayListAdd = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            arrayList.add("rgerg" + i);
        }
        long endArrayListAdd = System.currentTimeMillis();
        System.out.println("Add ArrayList: " + (endArrayListAdd - startArrayListAdd));
        ///////////////////////////////////////////////////////////////////////////

        long startLinkedListAdd = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            linkedList.add("rgerg" + i);
        }
        long endLinkedListAdd = System.currentTimeMillis();
        System.out.println("Add LinkedList: " + (endLinkedListAdd - startLinkedListAdd));
        ////////////////////////////////////////////////////////////////////////////////
        long startArrayListGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            arrayList.get( i);
        }
        long endArrayListGet = System.currentTimeMillis();
        System.out.println("Get ArrayList: " + (endArrayListGet - startArrayListGet));
        //////////////////////////////////////////////////////////////////////////////
        long startLinkedListGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            linkedList.get( i);
        }
        long endLinkedListGet = System.currentTimeMillis();
        System.out.println("Get LinkedList: " + (endLinkedListGet - startLinkedListGet));

    }
}

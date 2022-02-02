package lesson12;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils{

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList <Integer> result = new LinkedList<>();
        result.addAll(a);
        result.retainAll(b); // находит общее у коллекций
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet <Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet <Integer> result = new HashSet<>();
        result.addAll(a);
        result.retainAll(b);
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList <Integer> result = new LinkedList<>();
        result.addAll(a);
        result.removeAll(b); // удаление из первой коллекции схожих элементов
        return result;
    }
}
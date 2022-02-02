package lesson15;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingTovars {

    public static TreeSet<Tovar> sortByPriceFromTo(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByPrice = new TreeSet<>(new SortByPriceFromToComparator());
        for (Tovar t : tovars) {
            sortByPrice.add(t);
        }
        return sortByPrice;
    }

    public static TreeSet<Tovar> sortByPriceToFrom(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByPrice = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                //o1 - 1-й товар
                //o2 - 2-й товар

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }
                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare(o2.totalRate(), o1.totalRate());
                }
                if (!o1.getName().equals(o2.getName())) {
                    return o2.getName().compareTo(o1.getName());
                }

                return o2.getDialogs().size() - o1.getDialogs().size();
            }
        });
        for (Tovar t : tovars) {
            sortByPrice.add(t);
        }
        return sortByPrice;
    }

    public static TreeSet<Tovar> sortByNameAZ(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByName = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                //o1 - 1-й товар
                //o2 - 2-й товар

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare(o1.totalRate(), o2.totalRate());
                }

                return o1.getDialogs().size() - o2.getDialogs().size();
            }
        });
        for (Tovar t : tovars) {
            sortByName.add(t);
        }
        return sortByName;
    }

    public static TreeSet<Tovar> sortByDebatable(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByDeb = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                //this - 1-й товар
                //  o  - 2-й товар
                if (o1.getDialogs().size() != o2.getDialogs().size()){
                    return o2.getDialogs().size() - o1.getDialogs().size();
                }
                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare(o1.totalRate(), o2.totalRate());
                }
                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getPrice() - o2.getPrice();
            }

        });
        for (Tovar t : tovars) {
            sortByDeb.add(t);
        }
        return sortByDeb;
    }

    public static TreeSet <Tovar> sortByPopularity (Set <Tovar> tovars){
        TreeSet <Tovar> sortByPop = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                //this - 1-й товар
                //  o  - 2-й товар
                if (o1.getOtzivs().size() != o2.getOtzivs().size()){
                    return o2.getOtzivs().size() - o1.getOtzivs().size();
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getPrice() - o2.getPrice();
            }

        });
        for (Tovar t : tovars) {
            sortByPop.add(t);
        }
        return sortByPop;
    }
}


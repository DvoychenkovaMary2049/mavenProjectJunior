package lesson15;

import java.util.Comparator;

public class SortByPriceFromToComparator implements Comparator <Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        //o1 - 1-й товар
        //o2 - 2-й товар

        if (o1.getPrice() != o2.getPrice()){
            return o1.getPrice() - o2.getPrice();
        }
        if (o1.totalRate() != o2.totalRate()) {
            return Double.compare(o1.totalRate(), o2.totalRate());
        }
        if (!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        }

        return o1.getDialogs().size() - o2.getDialogs().size();
    }

}


package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;

public class Tovar implements Comparable<Tovar> {
    private String name;
    private int price;
    private ArrayList<Otziv> otzivs = new ArrayList<>();
    private ArrayList<Dialog> dialogs = new ArrayList<>();

    public Tovar() {
    }

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    public ArrayList<Dialog> getDialogs() {
        return dialogs;
    }

    public void setDialogs(ArrayList<Dialog> dialogs) {
        this.dialogs = dialogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addDialog(Dialog dialog) {
        dialogs.add(dialog);
    }

    public void addOtziv(Otziv otziv){
        otzivs.add(otziv);
    }


    public double totalRate() { // средний рейтинг отзывов (звезд)
        double summaOtziv = 0;

        for (Otziv otziv : otzivs) {
            summaOtziv = summaOtziv + otziv.getMainRate();
        }
        if (otzivs.size() > 0) {
            double total = summaOtziv / otzivs.size();
            return total;
        } else {
            return 0.0;
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tovar tovar = (Tovar) o;
        return price == tovar.price && Objects.equals(name, tovar.name) && Objects.equals(otzivs, tovar.otzivs) && Objects.equals(dialogs, tovar.dialogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, otzivs, dialogs);
    }

    @Override
    public String toString() {
        return "Товар " + name + '\'' +
                ", цена=" + price +
                ", отзывы=" + otzivs +
                ",обсуждения=" + dialogs;
    }


    @Override
    public int compareTo(Tovar o) { // по популярности (по звездам)
        //this - 1-й товар
        //  o  - 2-й товар
        if (this.totalRate() != o.totalRate()) {
            return Double.compare(this.totalRate(), o.totalRate());
        }
        if (!this.getName().equals(o.getName())) {
            return this.getName().compareTo(o.getName());
        }
        if (this.dialogs.size() != o.dialogs.size()) {
            return this.dialogs.size() - o.dialogs.size();
        }
        return this.price - o.price;
    }
}
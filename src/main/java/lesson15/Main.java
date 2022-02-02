package lesson15;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Мышка", 120);
        Tovar tovar2 = new Tovar("Клавиатура", 120);
        Tovar tovar3 = new Tovar("Ноутбук HP", 120);
        Tovar tovar4 = new Tovar("Гарнитура", 3500);
        Tovar tovar5 = new Tovar("Мышка DELL", 2600);

        Dialog dialog1 = new Dialog("Промокает ли?");
        Dialog dialog2 = new Dialog("Можно ли греть?");
        Dialog dialog3 = new Dialog("Как с устойчивостью?");
        Dialog dialog4 = new Dialog("В белом или сером цвете?");

        Otziv otziv1 = new Otziv(5, "Все гуд");
        Otziv otziv2 = new Otziv(4, "Хороший товар");
        Otziv otziv3 = new Otziv(3, "Не думаю что куплю еще раз");
        Otziv otziv4 = new Otziv(5, "Отличный товар");
        Otziv otziv5 = new Otziv(1, "Плохой товар");

        tovar1.addOtziv(otziv2);
        tovar2.addOtziv(otziv1);
        tovar3.addOtziv(otziv3);
        tovar3.addOtziv(otziv4);
        tovar5.addOtziv(otziv5);

        tovar1.addDialog(dialog1);
        tovar1.addDialog(dialog2);
        tovar3.addDialog(dialog3);
        tovar4.addDialog(dialog4);

        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        for (Tovar tovar : tovars) {  // по звездам
            System.out.println(tovar);
        }
        System.out.println("-------------sortByPriceFromTo-------------");
        TreeSet<Tovar> sortByPriceFromTo = SortingTovars.sortByPriceFromTo(tovars);
        for (Tovar tovar : sortByPriceFromTo) {
            System.out.println(tovar);
        }
        System.out.println("-------------sortByPriceToFrom-------------");
        TreeSet<Tovar> sortByPriceToFrom = SortingTovars.sortByPriceToFrom(tovars);
        for (Tovar tovar : sortByPriceToFrom) {
            System.out.println(tovar);
        }
        System.out.println("-------------sortByName-------------");
        TreeSet<Tovar> sortByNameAZ = SortingTovars.sortByNameAZ(tovars);
        for (Tovar tovar : sortByNameAZ) {
            System.out.println(tovar);
        }

        System.out.println("-------------sortByDebatable-------------");
        TreeSet<Tovar> sortByDebatable = SortingTovars.sortByDebatable(tovars);
        for (Tovar tovar : sortByDebatable) {
            System.out.println(tovar);
        }
        System.out.println("-------------sortByPopularity-------------");
        TreeSet<Tovar> sortByPopularity = SortingTovars.sortByPopularity(tovars);
        for (Tovar tovar : sortByPopularity) {
            System.out.println(tovar);
        }
    }
}
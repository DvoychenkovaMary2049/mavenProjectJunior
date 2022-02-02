package lesson12;

import java.util.Objects;

public class Coin {
    private int year;
    private int nominal;
    private double diametr;
    private String metal;

    public Coin() {
    }

    public Coin(int year, int nominal, double diametr, String metal) {
        this.year = year;
        this.nominal = nominal;
        this.diametr = diametr;
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return year == coin.year && nominal == coin.nominal && Double.compare(coin.diametr, diametr) == 0 && Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, nominal, diametr, metal);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "year=" + year +
                ", nominal=" + nominal +
                ", diametr=" + diametr +
                ", metal='" + metal + '\'' +
                '}';
    }
}
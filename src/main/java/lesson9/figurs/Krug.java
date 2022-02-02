package lesson9.figurs;

import java.util.Objects;

public class Krug implements Figura{
    private double radius;

    public Krug() {
    }

    public Krug(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double ploshad() {
        return Math.PI * (radius * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Krug krug = (Krug) o;
        return Double.compare(krug.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Krug{" +
                "radius=" + radius +
                '}';
    }
}

package lesson15;

import java.util.ArrayList;
import java.util.Objects;

public class Otziv {
    private int mainRate;
    private String mainText;

    public Otziv() {
    }

    public Otziv(int mainRate, String mainText) {
        this.mainRate = mainRate;
        this.mainText = mainText;
    }

    public int getMainRate() {
        return mainRate;
    }

    public void setMainRate(int mainRate) {
        this.mainRate = mainRate;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Otziv otziv = (Otziv) o;
        return mainRate == otziv.mainRate && Objects.equals(mainText, otziv.mainText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainRate, mainText);
    }

    @Override
    public String toString() {
        return "Отзыв: " + mainRate + ", '" + mainText;
    }
}

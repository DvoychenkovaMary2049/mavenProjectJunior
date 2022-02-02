package lesson15;

import java.util.Objects;

public class Dialog {

    private String temaDialoga;

    public Dialog() {
    }

    public Dialog( String temaDialoga) {

        this.temaDialoga = temaDialoga;
    }

    public String getTemaDialoga() {
        return temaDialoga;
    }

    public void setTemaDialoga(String temaDialoga) {
        this.temaDialoga = temaDialoga;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dialog dialog = (Dialog) o;
        return Objects.equals(temaDialoga, dialog.temaDialoga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temaDialoga);
    }

    @Override
    public String toString() {
        return "Тема диалога: " + temaDialoga;
    }
}
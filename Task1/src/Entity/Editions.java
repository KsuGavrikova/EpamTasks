package Entity;

import java.text.DecimalFormat;

/**
 * Created by Ksu on 11.04.2019.
 */
public class Editions {
    private int idEditions;
    private String title;
    private DecimalFormat cost;

    public int getIdEditions() {
        return idEditions;
    }

    public void setIdEditions(int idEditions) {
        this.idEditions = idEditions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DecimalFormat getCost() {
        return cost;
    }

    public void setCost(DecimalFormat cost) {
        this.cost = cost;
    }

    public Editions(int idEditions, String title, DecimalFormat cost) {
        this.idEditions = idEditions;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Editions editions = (Editions) o;

        if (idEditions != editions.idEditions) return false;
        if (!title.equals(editions.title)) return false;
        return cost.equals(editions.cost);

    }

    @Override
    public int hashCode() {
        int result = idEditions;
        result = 31 * result + title.hashCode();
        result = 31 * result + cost.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Editions{" +
                " title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}

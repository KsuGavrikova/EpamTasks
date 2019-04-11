package Entity;

import java.util.Date;

/**
 * Created by Ksu on 11.04.2019.
 */
public class Subscription {
    private int idSubscription;
    private int idEditions;
    private int idUser;
    private Date startSubscription;
    private Date stopSubscription;

    public int getIdSubscription() {
        return idSubscription;
    }

    public void setIdSubscription(int idSubscription) {
        this.idSubscription = idSubscription;
    }

    public int getIdEditions() {
        return idEditions;
    }

    public void setIdEditions(int idEditions) {
        this.idEditions = idEditions;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Date getStartSubscription() {
        return startSubscription;
    }

    public void setStartSubscription(Date startSubscription) {
        this.startSubscription = startSubscription;
    }

    public Date getStopSubscription() {
        return stopSubscription;
    }

    public void setStopSubscription(Date stopSubscription) {
        this.stopSubscription = stopSubscription;
    }

    public Subscription(int idSubscription, int idEditions, int idUser, Date startSubscription, Date stopSubscription) {
        this.idSubscription = idSubscription;
        this.idEditions = idEditions;
        this.idUser = idUser;
        this.startSubscription = startSubscription;
        this.stopSubscription = stopSubscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscription that = (Subscription) o;

        if (idSubscription != that.idSubscription) return false;
        if (idEditions != that.idEditions) return false;
        if (idUser != that.idUser) return false;
        if (!startSubscription.equals(that.startSubscription)) return false;
        return stopSubscription.equals(that.stopSubscription);

    }

    @Override
    public int hashCode() {
        int result = idSubscription;
        result = 31 * result + idEditions;
        result = 31 * result + idUser;
        result = 31 * result + startSubscription.hashCode();
        result = 31 * result + stopSubscription.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "idSubscription=" + idSubscription +
                ", idEditions=" + idEditions +
                ", idUser=" + idUser +
                ", startSubscription=" + startSubscription +
                ", stopSubscription=" + stopSubscription +
                '}';
    }
}

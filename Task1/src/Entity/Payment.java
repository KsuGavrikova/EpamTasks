package Entity;

import java.text.DecimalFormat;

/**
 * Created by Ksu on 11.04.2019.
 */
public class Payment {
    private int idPayment;
    private int idUser;
    private DecimalFormat paymentAmount;
    private boolean paid;

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public DecimalFormat getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(DecimalFormat paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Payment(int idPayment, int idUser, DecimalFormat paymentAmount, boolean paid) {
        this.idPayment = idPayment;
        this.idUser = idUser;
        this.paymentAmount = paymentAmount;
        this.paid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (idPayment != payment.idPayment) return false;
        if (idUser != payment.idUser) return false;
        if (paid != payment.paid) return false;
        return paymentAmount.equals(payment.paymentAmount);

    }

    @Override
    public int hashCode() {
        int result = idPayment;
        result = 31 * result + idUser;
        result = 31 * result + paymentAmount.hashCode();
        result = 31 * result + (paid ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                " idUser=" + idUser +
                ", paymentAmount=" + paymentAmount +
                ", paid=" + paid +
                '}';
    }
}

package Entity;

import java.util.Objects;

/**
 * Created by Ksu on 11.04.2019.
 */
public class User{
    private int idUser;
    private String login;
    private String password;
    private String email;
    private String adress;
    private boolean admin;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public User(int idUser, String login, String password, String email, String adress, boolean admin) {
        this.idUser = idUser;
        this.login = login;
        this.password = password;
        this.email = email;
        this.adress = adress;
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                " login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (idUser != user.idUser) return false;
        if (admin != user.admin) return false;
        if (!login.equals(user.login)) return false;
        if (!password.equals(user.password)) return false;
        if (!email.equals(user.email)) return false;
        return adress.equals(user.adress);
    }

    @Override
    public int hashCode() {
        int result = login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + adress.hashCode();
        result = 31 * result + (admin ? 1 : 0);
        return result;
    }
}

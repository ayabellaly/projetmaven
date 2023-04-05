package ma.bankati.model;

import java.util.Objects;

public class Client {
    long id;
    String Client;
    String email;
    String cin;
    String tel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return id == client.id && Objects.equals(Client, client.Client) && Objects.equals(email, client.email) && Objects.equals(cin, client.cin) && Objects.equals(tel, client.tel);
    }



    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", Client='" + Client + '\'' +
                ", email='" + email + '\'' +
                ", cin='" + cin + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }




}

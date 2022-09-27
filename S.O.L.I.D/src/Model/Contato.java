package Model;

public class Contato {
    int uuid;

    String numeroDeContato;

    String email;

    public Contato(int uuid, String numeroDeContato, String email) {
        this.uuid = uuid;
        this.numeroDeContato = numeroDeContato;
        this.email = email;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getNumeroDeContato() {
        return numeroDeContato;
    }

    public void setNumeroDeContato(String numeroDeContato) {
        this.numeroDeContato = numeroDeContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "uuid=" + uuid +
                ", numeroDeContato='" + numeroDeContato + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


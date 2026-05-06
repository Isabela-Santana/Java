package dao.model;

import java.time.OffsetDateTime;

public class UserModel {
    private long id; 
    private String nome; 
    private String email; 
    private OffsetDateTime birthday;

    public UserModel() {}

    public UserModel(long id, String nome, String email, OffsetDateTime birthday) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.birthday = birthday;
    }

    // Getters e Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public OffsetDateTime getBirthday() { return birthday; }
    public void setBirthday(OffsetDateTime birthday) { this.birthday = birthday; }

    @Override
    public String toString() {
        return String.format("ID: %d | Nome: %s | Email: %s | Data Nasc: %s", 
                id, nome, email, birthday.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
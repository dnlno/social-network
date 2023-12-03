package htwberlin.socialnetwork.mini.social.network.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name= "Benutzer")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nachname;
    private String vorname;
    private String studiengang;

    public User() {}

    public User(String nachname, String vorname, String studiengang){
        this.nachname = nachname;
        this.vorname = vorname;
        this.studiengang = studiengang;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNachname(){
        return nachname;
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public String getVorname(){
        return vorname;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public String getStudiengang(){
        return studiengang;
    }

    public void setStudiengang(String studiengang){
        this.studiengang = studiengang;
    }
}

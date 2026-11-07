package main.model;


import jakarta.persistence.*;

@Entity
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estid;
    @Column(name = "estnome", nullable = false, unique = true)
    private String estnome;
    @Column(name = "estibge",nullable = false,unique = true)
    private String estibge;
    @Column(name="estsigla",nullable = false,unique = true)
    private String estsigla;

    public Estado(Long estid, String estnome, String estibge, String estsigla) {
        this.estid = estid;
        this.estnome = estnome;
        this.estibge = estibge;
        this.estsigla = estsigla;
    }
    public Estado(){

    }

    public Long getEstid() {
        return estid;
    }

    public void setEstid(Long estid) {
        this.estid = estid;
    }

    public String getEstnome() {
        return estnome;
    }

    public void setEstnome(String estnome) {
        this.estnome = estnome;
    }

    public String getEstibge() {
        return estibge;
    }

    public void setEstibge(String estibge) {
        this.estibge = estibge;
    }

    public String getEstsigla() {
        return estsigla;
    }

    public void setEstsigla(String estsigla) {
        this.estsigla = estsigla;
    }
}

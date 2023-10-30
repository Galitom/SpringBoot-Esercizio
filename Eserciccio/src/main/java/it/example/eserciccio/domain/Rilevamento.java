package it.example.eserciccio.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Rilevamento {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String data;
    private String debito;

    @ManyToOne
    private Nazione nazione;

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Nazione getNazione() {
        return nazione;
    }

    public void setNazione(Nazione nazione) {
        this.nazione = nazione;
    }

    public String getDebito() {
        return debito;
    }

    public void setDebito(String debito) {
        this.debito = debito;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

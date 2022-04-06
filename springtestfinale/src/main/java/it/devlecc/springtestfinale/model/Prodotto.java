package it.devlecc.springtestfinale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Prodotto {
    @Id
    @GeneratedValue
    private Long id;

    private String nomeDelProdotto;

    private Date dataDiAcquisto;
    private Date dataDiScadenza;

    private float prezzo;
    private float ranking;

    public Prodotto() {
    }

    public Prodotto(String nomeDelProdotto) {
        this.nomeDelProdotto = nomeDelProdotto;
    }


    public Prodotto(Long id, String nomeDelProdotto, Date dataDiAcquisto, Date dataDiScadenza, float prezzo, float ranking) {
        this.id = id;
        this.nomeDelProdotto = nomeDelProdotto;
        this.dataDiAcquisto = dataDiAcquisto;
        this.dataDiScadenza = dataDiScadenza;
        this.prezzo = prezzo;
        this.ranking = ranking;
    }

    public Prodotto(String nomeDelProdotto, Date dataDiAcquisto, Date dataDiScadenza, float prezzo, float ranking) {
        this.nomeDelProdotto = nomeDelProdotto;
        this.dataDiAcquisto = dataDiAcquisto;
        this.dataDiScadenza = dataDiScadenza;
        this.prezzo = prezzo;
        this.ranking = ranking;
    }

    public Prodotto(String nomeDelProdotto, Date dataDiAcquisto, float prezzo) {
        this.nomeDelProdotto = nomeDelProdotto;
        this.dataDiAcquisto = dataDiAcquisto;
        this.prezzo = prezzo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDelProdotto() {
        return nomeDelProdotto;
    }

    public void setNomeDelProdotto(String nomeDelProdotto) {
        this.nomeDelProdotto = nomeDelProdotto;
    }

    public Date getDataDiAcquisto() {
        return dataDiAcquisto;
    }

    public void setDataDiAcquisto(Date dataDiAcquisto) {
        this.dataDiAcquisto = dataDiAcquisto;
    }

    public Date getDataDiScadenza() {
        return dataDiScadenza;
    }

    public void setDataDiScadenza(Date dataDiScadenza) {
        this.dataDiScadenza = dataDiScadenza;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public float getRanking() {
        return ranking;
    }

    public void setRanking(float ranking) {
        this.ranking = ranking;
    }
}

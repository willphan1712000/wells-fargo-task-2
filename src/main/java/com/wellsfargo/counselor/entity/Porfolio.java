package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Porfolio {
    @Id
    @GeneratedValue()
    private long porfolioId;

    @ManyToOne
    @JoinColumn(name = 'client_id')
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    protected Porfolio() {}

    public Porfolio(Client client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPorfolioId() { return porfolioId; }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }

    public String getCreationDate() { return creationDate; }

    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
}
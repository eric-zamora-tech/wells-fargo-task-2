package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private LocalDate creationDate;

    protected Portfolio() {

    }

    public Portfolio(Clilent client, LocalDate creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}

package com.demos.arche7.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="client")
@PrimaryKeyJoinColumn(name = "id")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @Column(name = "mot_de_passe")
    private String motDePasse;
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private  Commande commande;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    public Client(Long id, String nom, String prenom, String email, String motDePasse, Commande commande, Adresse adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.commande = commande;
        this.adresse = adresse;
    }

    //    @ManyToOne
//    @JoinColumn(name = "panier_id")
//    private Panier Panier;

    public Client() {

    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String password) {
        this.motDePasse = password;
    }
    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", password='" + motDePasse + '\'' +
                '}';
    }




}

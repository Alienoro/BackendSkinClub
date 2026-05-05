package se.yrgo.domain;

import jakarta.persistence.*;

@Entity
public class Skin {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private String rarity;
    private String wear;
    private String weaponType;
    private double price;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private PlayerInventory inventory;

    public Skin() {}

    // constructors, getters, setters
}
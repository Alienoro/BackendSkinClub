package se.yrgo.domain;

import jakarta.persistence.*;

@Entity
public class Skin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;
    private String rarity;
    private String wear;
    private String weaponType;
    private double price;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private PlayerInventory inventory;

    public Skin() {
    }

    public Skin(String name, String rarity, String wear, String weaponType, double price) {
        this.name = name;
        this.rarity = rarity;
        this.wear = wear;
        this.weaponType = weaponType;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getWear() {
        return wear;
    }

    public void setWear(String wear) {
        this.wear = wear;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PlayerInventory getInventory() {
        return inventory;
    }

    public void setInventory(PlayerInventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Skin [id=" + id + ", name=" + name + ", rarity=" + rarity + ", wear=" + wear + ", weaponType="
                + weaponType + ", price=" + price + "]";
    }
}
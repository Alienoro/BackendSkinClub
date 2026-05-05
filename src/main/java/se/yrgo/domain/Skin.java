package se.yrgo.domain;

public class Skin {

    private String id;

    private String name;

    private String rarity;

    private String wear;

    private String weaponType;

    private double price;

    public Skin() {
    }

    public Skin(String name, String rarity, String wear, String weaponType, double value) {
        this.name = name;
        this.rarity = rarity;
        this.wear = wear;
        this.weaponType = weaponType;
        this.price = value;
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

    public void setPrice(double value) {
        this.price = value;
    }

    @Override
    public String toString() {
        return "Skin [name=" + name + ", rarity=" + rarity + ", wear=" + wear + ", weaponType=" + weaponType
                + ", value=" + price + "]";
    }
}
package se.yrgo.domain;

import jakarta.persistence.*;
import se.yrgo.domain.PlayerInventory;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Loadout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @OneToOne
    @JoinColumn(name = "inventory_id", nullable = false)
    private PlayerInventory playerInventory;

    @OneToMany
    @JoinTable(
            name = "loadout_skins",
            joinColumns = @JoinColumn(name = "loadout_id"),
            inverseJoinColumns = @JoinColumn(name = "skin_id")
    )
    private List<Skin> skins = new ArrayList<>();

    public Loadout() {}

    public Loadout(PlayerInventory playerInventory) {
        this.playerInventory = playerInventory;
    }

    // BUSINESS RULE ENFORCEMENT
    public void addSkin(Skin skin) {
        if (!playerInventory.getSkins().contains(skin)) {
            throw new IllegalArgumentException("Skin does not belong to this player's inventory");
        }
        skins.add(skin);
    }

    public void removeSkin(Skin skin) {
        skins.remove(skin);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PlayerInventory getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(PlayerInventory playerInventory) {
        this.playerInventory = playerInventory;
    }

    public List<Skin> getSkins() {
        return skins;
    }

    public void setSkins(List<Skin> skins) {
        this.skins = skins;
    }

    @Override
    public String toString() {
        return "Loadout [id=" + id + ", skins=" + skins + "]";
    }
}
package se.yrgo.domain;

import jakarta.persistence.*;
import se.yrgo.domain.Skin;

import java.util.List;

@Entity
public class PlayerInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String playerName;

    @OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL)
    private List<Skin> skins;

    private double value;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Skin> getSkins() {
        return skins;
    }

    public void setSkins(List<Skin> skins) {
        this.skins = skins;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
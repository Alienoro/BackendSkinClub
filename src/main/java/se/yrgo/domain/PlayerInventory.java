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

    // constructors, getters, setters
}
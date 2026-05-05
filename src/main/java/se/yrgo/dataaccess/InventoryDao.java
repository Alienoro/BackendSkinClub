package main.java.se.yrgo.dataaccess;

import java.util.List;

public interface InventoryDao {

    public void addSkin(Skin newSkin);

    public void deleteSkin(Skin oldSkin);

    public Skin findSkinById(String id);

    public List<Skin> findSkinsByName(String name);

    public List<Skin> getAllSkins();
}
package se.yrgo.services;

import java.util.List;

import se.yrgo.domain.Skin;

public interface InventoryManagementService {

    public void addSkin(Skin newSkin);

    public void deleteSkin(Skin oldSkin);

    public Skin findSkinById(String id);

    public List<Skin> findSkinsByName(String name);

    public List<Skin> getAllSkins();
}
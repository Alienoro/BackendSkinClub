package se.yrgo.dataaccess;

import se.yrgo.domain.Skin;

import java.util.List;

public interface PlayerInventoryDao {

    public void addSkin(Skin newSkin);

    public void deleteSkin(Skin oldSkin);

    public Skin findSkinById(String id);

    public List<Skin> findSkinsByName(String name);

    public List<Skin> getAllSkins();
}
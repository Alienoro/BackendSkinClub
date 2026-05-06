package se.yrgo.dataaccess;

import se.yrgo.domain.PlayerInventory;
import se.yrgo.domain.Skin;

import java.util.List;

public interface LoadoutDao {
    public void addSkin(Skin newSkin);

    public void deleteSkin(Skin oldSkin);

    public Skin findSkinById(String id);

    public List<Skin> getAllSkins();

}

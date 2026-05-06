package se.yrgo.services;

import java.util.List;

import se.yrgo.dataaccess.PlayerInventoryDao;
import se.yrgo.domain.Skin;

public class InventoryManagementServiceImpl implements InventoryManagementService {
    private PlayerInventoryDao dao;

    @Override
    public void addSkin(Skin newSkin) {
        dao.addSkin(newSkin);
    }

    @Override
    public void deleteSkin(Skin oldSkin) {
        dao.deleteSkin(oldSkin);
    }

    @Override
    public Skin findSkinById(String id) {
        return dao.findSkinById(id);
    }

    @Override
    public List<Skin> findSkinsByName(String name) {
        return dao.findSkinsByName(name);
    }

    @Override
    public List<Skin> getAllSkins() {
       return dao.getAllSkins();
    }
}
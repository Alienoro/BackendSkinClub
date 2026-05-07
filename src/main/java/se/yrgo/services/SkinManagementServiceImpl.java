package se.yrgo.services;

import java.util.List;

import se.yrgo.dataaccess.SkinDao;
import se.yrgo.domain.Skin;

public class SkinManagementServiceImpl implements SkinManagementService {
    private SkinDao dao;

    @Override
    public void addSkin(Skin skin) {
        dao.addSkin(skin);
    }

    @Override
    public Skin findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Skin> findAvailableSkins() {
        return dao.findAvailableSkins();
    }
}
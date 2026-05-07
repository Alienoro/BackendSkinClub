package se.yrgo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.yrgo.dataaccess.SkinDao;
import se.yrgo.domain.Skin;

@Service
public class SkinManagementServiceImpl implements SkinManagementService {
    
    private SkinDao dao;

    @Autowired
    public SkinManagementServiceImpl(SkinDao dao) {
        this.dao = dao;
    }

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
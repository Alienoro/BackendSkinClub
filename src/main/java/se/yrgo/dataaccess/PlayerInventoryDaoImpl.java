package se.yrgo.dataaccess;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import se.yrgo.domain.Skin;

public class PlayerInventoryDaoImpl implements PlayerInventoryDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addSkin(Skin newSkin) {
        em.persist(newSkin);
    }

    @Override
    public void deleteSkin(Skin oldSkin) {
        em.remove(oldSkin);
    }

    @Override
    public Skin findSkinById(String id) {
        return em.createQuery(
                "select skin from PlayerInventory as skin where skin.id = :id", Skin.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<Skin> findSkinsByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findSkinsByName'");
    }

    @Override
    public List<Skin> getAllSkins() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllSkins'");
    }
}
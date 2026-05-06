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
        return em.createQuery("select skins from PlayerInventory as skins where skins.name = :name", Skin.class)
                .setParameter("name", name)
                .getResultList();
    }

    @Override
    public List<Skin> getAllSkins() {
        return em.createQuery("select skins from PlayerInventory as skins", Skin.class)
                .getResultList();
    }
}
package se.yrgo.dataaccess;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import se.yrgo.domain.Loadout;
import se.yrgo.domain.PlayerInventory;
import se.yrgo.domain.Skin;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LoadoutDaoImpl implements LoadoutDao {
    PlayerInventoryDaoImpl playerInventory;

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
                        "select skin from Loadout as skin where skin.id = :id", Skin.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<Skin> getAllSkins() {
        return em.createQuery(
                        "select s from Loadout l join l.skins s", Skin.class)
                .getResultList();
    }
}

package se.yrgo.dataaccess;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import se.yrgo.domain.Skin;

@Repository
public class SkinDaoImpl implements SkinDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addSkin(Skin skin) {
        em.persist(skin);
    }

    @Override
    public Skin findById(Long id) {
        return em.createQuery("select s from Skin as s where s.id = :id", Skin.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<Skin> findAvailableSkins() {
        return em.createQuery("select s from Skin as s where s.inventory is null", Skin.class)
                .getResultList();
    }
}
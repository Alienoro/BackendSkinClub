package se.yrgo.dataaccess;

import se.yrgo.domain.Skin;
import java.util.List;

public interface SkinDao {

    public void addSkin(Skin skin);

    public Skin findById(Long id);

    public List<Skin> findAvailableSkins();
}

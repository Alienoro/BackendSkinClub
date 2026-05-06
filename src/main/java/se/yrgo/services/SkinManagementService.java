package se.yrgo.services;

import se.yrgo.domain.Skin;
import java.util.List;

public interface SkinManagementService {

    public void addSkin(Skin skin);

    public Skin findById(Long id);

    public List<Skin> findAvailableSkins();
}

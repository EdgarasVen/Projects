package lt.estate.app.service;

import lt.estate.app.model.Building;
import lt.estate.app.model.Owner;

import java.util.List;

public interface EstateService {

    List<Owner> getAllOwners();

    List<Building> getAllBuildings();

    void createBuilding(Building building);

    void createOwner(Owner owner);

    Building findBuildingById(Long id);

    void deleteBuildingById(Long id);

    Owner findOwnerById(Long id);

    void deleteOwnerById(Long id);

    void updateBuilding(Long id, Building newBuilding);

    void updateOwner(Long id, Owner newOwner);
}

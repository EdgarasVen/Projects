package lt.estate.app.service;

import lombok.extern.slf4j.Slf4j;
import lt.estate.app.model.Building;
import lt.estate.app.model.Owner;
import lt.estate.app.repo.RepoBuilding;
import lt.estate.app.repo.RepoOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EstateServiceImp implements EstateService{
    private final RepoBuilding repoBuilding;
    private final RepoOwner repoOwner;

    @Autowired
    public EstateServiceImp(RepoBuilding repoBuilding, RepoOwner repoOwner) {
        this.repoBuilding = repoBuilding;
        this.repoOwner = repoOwner;
    }

    @Override
    public List<Owner> getAllOwners() {
        return null;
    }

    @Override
    public List<Owner> getAllBuildings() {
        return null;
    }

    @Override
    public void createBuilding(Building building) {

    }

    @Override
    public void createOwner(Owner owner) {

    }

    @Override
    public Building findBuildingById(Long id) {
        return null;
    }

    @Override
    public void deleteBuildingById(Long id) {

    }

    @Override
    public Owner findOwnerById(Long id) {
        return null;
    }

    @Override
    public void deleteOwnerById(Long id) {

    }

    @Override
    public void updateBuilding(Long id, Building build) {

    }

    @Override
    public void updateOwner(Long id, Owner build) {

    }
}

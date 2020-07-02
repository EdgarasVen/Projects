package lt.estate.app.service;

import lombok.extern.slf4j.Slf4j;
import lt.estate.app.model.Building;
import lt.estate.app.model.Owner;
import lt.estate.app.repo.RepoBuilding;
import lt.estate.app.repo.RepoOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Owner> list=repoOwner.findAll();
        log.info("IN getAllOwners - list size:{} ",list.size());
        return list;
    }

    @Override
    public List<Building> getAllBuildings() {
        List<Building> list=repoBuilding.findAll();
        log.info("IN getAllBuildings - list size:{} ",list.size());
        return list;
    }

    @Override
    public void createBuilding(Building building) {
        repoBuilding.save(building);
        log.info("IN createBuilding - save successful");
    }

    @Override
    public void createOwner(Owner owner) {
        repoOwner.save(owner);
        log.info("IN createOwner - save successful");
    }

    @Override
    public Building findBuildingById(Long id) {
        List<Building> list=repoBuilding.findAll();
        Building building= list.stream().filter(i -> i.getId()==id )
                .findFirst().orElse(null);
        if(building==null){
            log.info("IN findBuildingById - no building with such id: {}",id);
        } else {
            log.info("IN findBuildingById - find successful");
        }
        return building;
    }

    @Override
    public void deleteBuildingById(Long id) {
        repoBuilding.deleteById(id);
        log.info("IN deleteBuildingById - deleted by id: {}",id);
    }

    @Override
    public Owner findOwnerById(Long id) {
        List<Owner> list=repoOwner.findAll();
        Owner owner= list.stream().filter(i -> i.getId()==id )
                .findFirst().orElse(null);
        if(owner==null){
            log.info("IN findOwnerById - no owner with such id: {}",id);
        } else {
            log.info("IN findOwnerById - find successful");
        }
        return owner;
    }

    @Override
    public void deleteOwnerById(Long id) {
        List<Building> list=repoBuilding.findAll();
        List<Building> filteredList=list.stream().filter(building -> building.getOwner().getId()==id)
                .collect(Collectors.toList());
        for (Building b :filteredList
                ) {
            b.setOwner(null);
            repoBuilding.save(b);
            log.info("IN deleteOwnerById - set null to building owner, building id: {}",b.getId());
        }
        repoOwner.deleteById(id);
        log.info("IN deleteOwnerById - deleted by id: {}",id);
    }

    @Override
    public void updateBuilding(Long id, Building newBuilding) {
        List<Building> list=repoBuilding.findAll();
        Building building= list.stream().filter(i -> i.getId()==id )
                .findFirst().orElse(null);
        if(building!=null){
            building.setUpdated(new Date());
            building.setAddress(newBuilding.getAddress());
            building.setOwner(newBuilding.getOwner());
            building.setSize(newBuilding.getSize());
            building.setValue(newBuilding.getValue());
            building.setType(newBuilding.getType());
            repoBuilding.save(building);
            log.info("IN updateBuilding - building updated");
        } else {
            log.info("IN updateBuilding - building not found");
        }
    }

    @Override
    public void updateOwner(Long id, Owner newOwner) {
        List<Owner> list =repoOwner.findAll();
        Owner owner= list.stream().filter(i -> i.getId()==id )
                .findFirst().orElse(null);
        if(owner!=null){
            owner.setUpdated(new Date());
            owner.setName(newOwner.getName());
            owner.setAddress(newOwner.getAddress());
            owner.setSurname(newOwner.getSurname());
            owner.setTelephone(newOwner.getTelephone());
            owner.setBuildings(newOwner.getBuildings());
            log.info("IN updateOwner - owner updated");
        } else {
            log.info("IN updateOwner - owner not found");
        }
    }
}

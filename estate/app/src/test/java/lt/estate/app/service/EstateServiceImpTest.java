package lt.estate.app.service;

import lt.estate.app.dto.DtoBuilding;
import lt.estate.app.dto.DtoOwner;
import lt.estate.app.model.Building;
import lt.estate.app.model.Owner;
import lt.estate.app.repo.RepoBuilding;
import lt.estate.app.repo.RepoOwner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class EstateServiceImpTest {
    @Autowired
    private EstateServiceImp serviceImp;

    @MockBean
    private RepoBuilding repoBuilding;

    @MockBean
    private RepoOwner repoOwner;

    @Test
    void createBuilding() {
        Building building=new Building();
        serviceImp.createBuilding(building);
        Mockito.verify(repoBuilding,Mockito.times(1)).save(building);
    }

    @Test
    void createOwner() {
        Owner owner=new Owner();
        serviceImp.createOwner(owner);
        Mockito.verify(repoOwner,Mockito.times(1)).save(owner);
    }


    @Test
    void getAllOwners() {
        serviceImp.getAllOwners();
        Mockito.verify(repoOwner,Mockito.times(1)).findAll();
    }

    @Test
    void getAllBuildings() {
        serviceImp.getAllBuildings();
        Mockito.verify(repoBuilding,Mockito.times(1)).findAll();
    }

    @Test
    void findBuildingById() {
        serviceImp.findBuildingById(1L);
        Mockito.verify(repoBuilding, Mockito.times(1)).findAll();
    }

    @Test
    void findOwnerById() {
        serviceImp.findOwnerById(1L);
        Mockito.verify(repoOwner, Mockito.times(1)).findAll();
    }

    @Test
    void deleteOwnerById() {
        Owner owner=new Owner();
        serviceImp.deleteOwnerById(1L,owner);
        Mockito.verify(repoOwner, Mockito.times(1)).deleteById(1L);
    }

    @Test
    void updateBuilding() {
        Building building= new Building();
        serviceImp.updateBuilding(1L,new Building(),building);
        Mockito.verify(repoBuilding, Mockito.times(1)).save(building);
    }

    @Test
    void updateOwner() {
        Owner owner=new Owner();
        serviceImp.updateOwner(1L,new Owner(),owner);
        Mockito.verify(repoOwner, Mockito.times(1)).save(owner);
    }

}
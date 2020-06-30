package lt.estate.app.service;

import lt.estate.app.model.Owner;

import java.util.List;

public interface EstateService {

    List<Owner> getAllOwners();

    List<Owner> getAllBuildings();
}

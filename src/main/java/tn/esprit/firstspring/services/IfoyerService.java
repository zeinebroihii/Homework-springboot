package tn.esprit.firstspring.services;

import tn.esprit.firstspring.entities.Foyer;

import java.util.List;

public interface IfoyerService {
    Foyer findById(Integer id);  // id should be Long to match the repository
    List<Foyer> findAll();
    Foyer save(Foyer foyer);
    void delete(Foyer foyer);
}

package tn.esprit.firstspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstspring.entities.Foyer;
import tn.esprit.firstspring.repositories.FoyerRepository;

import java.util.List;
import java.util.Optional;

@Service
public abstract class FoyerService implements IfoyerService {

    private final FoyerRepository foyerRepository;

    @Autowired
    public FoyerService(FoyerRepository foyerRepository) {
        this.foyerRepository = foyerRepository;
    }

    @Override
    public Foyer findById(Integer id) {
        // Use Optional to handle cases where the entity may not be found
        Optional<Foyer> foyer = foyerRepository.findById(id);
        return foyer.orElse(null);  // Or you can throw an exception
    }

    @Override
    public List<Foyer> findAll() {
        return (List<Foyer>) foyerRepository.findAll();  // Cast to List<Foyer>
    }

    @Override
    public Foyer save(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void delete(Foyer foyer) {
        foyerRepository.delete(foyer);
    }
}

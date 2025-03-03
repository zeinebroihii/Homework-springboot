package tn.esprit.firstspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstspring.entities.Foyer;
import tn.esprit.firstspring.repositories.IChambreReposirtory;
import tn.esprit.firstspring.repositories.IFoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerServices {

    IFoyerRepository foyerRepository;
    IChambreReposirtory chambreReposirtory;
    @Override
    public Foyer findById(long id) {
        return foyerRepository.findById((int) id).orElse(null);
    }

    @Override
    public List<Foyer> findAll() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer save(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void delete(Long id) {
        foyerRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public Foyer getNomCapacite(String nom, Long capacite) {
        return foyerRepository.findByNomFoyerAndCapaciteFoyer(nom, capacite);
    }

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return List.of();
    }

    @Override
    public Foyer addFoyer(Foyer f)
    {
        return foyerRepository.save(f);
    }


    @Override
    public Foyer updateFoyer(Foyer f) {
        if (foyerRepository.existsById((int) f.getIdFoyer())) {
            return foyerRepository.save(f);
        }
        return null;
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById((int) idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {

        foyerRepository.deleteById((int) idFoyer);
    }

}
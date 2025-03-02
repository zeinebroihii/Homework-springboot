package tn.esprit.firstspring.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstspring.entities.*;
import tn.esprit.firstspring.repositories.IUniversiteRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteServices {
    IUniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        if (universiteRepository.existsById(u.getIdUniversite())) {
            return universiteRepository.save(u);
        }
        return null;
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {

        return universiteRepository.findById(idUniversite).orElse(null);
    }
}
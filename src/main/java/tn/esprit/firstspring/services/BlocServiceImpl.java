package tn.esprit.firstspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstspring.entities.Bloc;
import tn.esprit.firstspring.repositories.IBlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocServices {

    IBlocRepository iBlocRepository;

    @Override
    public List<Bloc> retrieveBlocs() {
        return iBlocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        if (iBlocRepository.existsById((long) bloc.getIdBloc())) {
            return iBlocRepository.save(bloc);
        }
        return null;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return iBlocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return iBlocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        iBlocRepository.deleteById(idBloc);

    }
}
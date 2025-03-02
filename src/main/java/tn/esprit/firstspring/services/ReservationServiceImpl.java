package tn.esprit.firstspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstspring.entities.Reservation;
import tn.esprit.firstspring.repositories.IReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationServices{

    IReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        if (reservationRepository.existsById(Long.valueOf(res.getIdReservation()))) {
            return reservationRepository.save(res);
        }
        return null;
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
}
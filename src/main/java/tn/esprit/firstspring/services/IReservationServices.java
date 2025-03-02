package tn.esprit.firstspring.services;

import tn.esprit.firstspring.entities.Reservation;

import java.util.List;

public interface IReservationServices {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (Long idReservation);
}
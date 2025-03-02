package tn.esprit.firstspring.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspring.entities.Reservation;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Long> {
}

package tn.esprit.firstspring.services;

import tn.esprit.firstspring.entities.Etudiant;
import java.util.List;

public interface IEtudiantServices {
    List<Etudiant> retrieveAllEtudiants();
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(long idEtudiant);
    void removeEtudiant(long idEtudiant);

}

package tn.esprit.firstspring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspring.entities.Foyer;
import tn.esprit.firstspring.services.IfoyerService;
import java.util.List;

@RestController
@RequestMapping("/foyers")
public class FoyerController {

    private final IfoyerService foyerService;

    @Autowired
    public FoyerController(IfoyerService foyerService) {
        this.foyerService = foyerService;
    }

    // Get all foyers
    @GetMapping
    public ResponseEntity<List<Foyer>> getAllFoyers() {
        List<Foyer> foyers = foyerService.findAll();
        return new ResponseEntity<>(foyers, HttpStatus.OK);
    }

    // Get foyer by ID
    @GetMapping("/{id}")
    public ResponseEntity<Foyer> getFoyerById(@PathVariable Integer id) {
        Foyer foyer = foyerService.findById(id);
        if (foyer != null) {
            return new ResponseEntity<>(foyer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new foyer
    @PostMapping
    public ResponseEntity<Foyer> createFoyer(@RequestBody Foyer foyer) {
        Foyer savedFoyer = foyerService.save(foyer);
        return new ResponseEntity<>(savedFoyer, HttpStatus.CREATED);
    }

    // Update an existing foyer
    @PutMapping("/{id}")
    public ResponseEntity<Foyer> updateFoyer(@PathVariable Integer id, @RequestBody Foyer foyer) {
        Foyer existingFoyer = foyerService.findById(id);
        if (existingFoyer != null) {
            foyer.setId(id);  // Update the ID so that it's used in the database
            Foyer updatedFoyer = foyerService.save(foyer);
            return new ResponseEntity<>(updatedFoyer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a foyer
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFoyer(@PathVariable Integer id) {
        Foyer foyer = foyerService.findById(id);
        if (foyer != null) {
            foyerService.delete(foyer);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

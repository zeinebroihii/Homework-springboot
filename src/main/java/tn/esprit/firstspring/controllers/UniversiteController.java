package tn.esprit.firstspring.controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstspring.entities.Universite;
import tn.esprit.firstspring.services.IUniversiteServices;

import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteController {
    IUniversiteServices universiteService;


    @GetMapping("/getAllUniversities")
    public List<Universite> retrieveAllUniversities() {
        return universiteService.retrieveAllUniversities();
    }


    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }


    @PutMapping("/updateUniversite/{id}")
    public Universite updateUniversite(@PathVariable("id") long idUniversite, @RequestBody Universite universite) {

        return universiteService.updateUniversite(universite);
    }


    @GetMapping("/getById/{id}")
    public Universite retrieveUniversite(@PathVariable("id") long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }
}
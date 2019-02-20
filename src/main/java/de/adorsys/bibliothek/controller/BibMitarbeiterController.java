package de.adorsys.bibliothek.controller;

import de.adorsys.bibliothek.domain.BibMitarbeiter;
import de.adorsys.bibliothek.service.BibMitarbeiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/bibmitarbeiter")
@CrossOrigin(origins = "http://localhost:4200")
public class BibMitarbeiterController {
    @Autowired
    BibMitarbeiterService bibMitarbeiterService;

    //--------------------------liste of BibMitarbeiter------------------------
    @GetMapping
    public ResponseEntity<?> getAllBibMitarbeiter() {
        return new ResponseEntity<Object>(bibMitarbeiterService.getAllBibMitarbeiter(), HttpStatus.OK);
    }
    //-------------------------get a single BibMitarbeiter-------------------------
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<BibMitarbeiter>> getSingleBibMitarbeiter (@PathVariable Long id) {
        return new ResponseEntity<>(bibMitarbeiterService.getSingleBibMitarbeiter(id), HttpStatus.OK);
    }
    //-------------------------delete a BibMitarbeiter-------------------------
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBibMitarbeiter (@PathVariable Long id){
        Optional<BibMitarbeiter> employee = bibMitarbeiterService.findById(id);
        if (!employee.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        bibMitarbeiterService.deleteBibMitarbeiter (id);
        return  new ResponseEntity<Object>(bibMitarbeiterService.getAllBibMitarbeiter(), HttpStatus.OK);
    }
    //------------------------save or add a BibMitarbeiter-----------------------
    @RequestMapping( method = RequestMethod.POST)
    public ResponseEntity <?>save(@RequestBody BibMitarbeiter bibMitarbeiter) {
        bibMitarbeiterService.save(bibMitarbeiter);
        return  new ResponseEntity<Object>(bibMitarbeiterService.getAllBibMitarbeiter(), HttpStatus.OK);
    }
    // ------------------------update a BibMitarbeiter-------------------------
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<BibMitarbeiter> updateBibMitarbeiter(@PathVariable("id") Long id, @RequestBody BibMitarbeiter bibMitarbeiter) {
        BibMitarbeiter updated = bibMitarbeiterService.updateBibMitarbeiter(id, bibMitarbeiter);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }
}

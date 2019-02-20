package de.adorsys.bibliothek.controller;

import de.adorsys.bibliothek.domain.BibMitglied;
import de.adorsys.bibliothek.service.BibMitgliedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/bibmitglied")
@CrossOrigin(origins = "http://localhost:4200")

public class BibMitgliedController {

    @Autowired
    BibMitgliedService bibMitgliedService;

    //--------------------------liste of BibMitglied------------------------
    @GetMapping
    public ResponseEntity<?> getAllBibMitglied() {
        return new ResponseEntity<Object>(bibMitgliedService.getAllBibMitglied(), HttpStatus.OK);
    }
    //-------------------------get a single BibMitglied-------------------------
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<BibMitglied>> getSingleBibMitarbeiter (@PathVariable Long id) {
        return new ResponseEntity<>(bibMitgliedService.getSingleBibMitglied(id), HttpStatus.OK);
    }
    //-------------------------delete a BibMitglied-------------------------
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBibMitglied (@PathVariable Long id){
        Optional<BibMitglied> employee = bibMitgliedService.findById(id);
        if (!employee.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        bibMitgliedService.deleteBibMitglied (id);
        return  new ResponseEntity<Object>(bibMitgliedService.getAllBibMitglied(), HttpStatus.OK);
    }
    //------------------------save or add a BibMitglied-----------------------
    @RequestMapping( method = RequestMethod.POST)
    public ResponseEntity <?>save(@RequestBody BibMitglied bibMitglied) {
        bibMitgliedService.save(bibMitglied);
        return  new ResponseEntity<Object>(bibMitgliedService.getAllBibMitglied(), HttpStatus.OK);
    }
    // ------------------------update a BibMitglied-------------------------
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<BibMitglied> updateBibMitglied(@PathVariable("id") Long id, @RequestBody BibMitglied bibMitglied) {
        BibMitglied updated = bibMitgliedService.updateBibMitglied(id, bibMitglied);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }
}

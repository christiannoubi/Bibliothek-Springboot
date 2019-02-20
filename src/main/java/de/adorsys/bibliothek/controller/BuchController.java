package de.adorsys.bibliothek.controller;

import de.adorsys.bibliothek.domain.Buch;
import de.adorsys.bibliothek.service.BuchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/buch")
@CrossOrigin(origins = "http://localhost:4200")
public class BuchController {
    @Autowired
    BuchService buchService;

    //--------------------------liste of Buch------------------------
    @GetMapping
    public ResponseEntity<?> getAllBuecher() {
        return new ResponseEntity<Object>(buchService.getAllBuecher(), HttpStatus.OK);
    }
    //-------------------------get a single Buch-------------------------
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Buch>> getSingleBuch (@PathVariable Long id) {
        return new ResponseEntity<>(buchService.getSingleBuch(id), HttpStatus.OK);
    }
    //-------------------------delete a Buch-------------------------
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBuch (@PathVariable Long id){
        Optional<Buch> employee = buchService.findById(id);
        if (!employee.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        buchService.deleteBuch (id);
        return  new ResponseEntity<Object>(buchService.getAllBuecher(), HttpStatus.OK);
    }
    //------------------------save or add a Buch-----------------------
    @RequestMapping( method = RequestMethod.POST)
    public ResponseEntity <?>save(@RequestBody Buch buch) {
        buchService.save(buch);
        return  new ResponseEntity<Object>(buchService.getAllBuecher(), HttpStatus.OK);
    }
    // ------------------------update a Buch-------------------------
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Buch> updateBuch(@PathVariable("id") Long id, @RequestBody Buch buch) {
        Buch updated = buchService.updateBuch(id, buch);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }
}

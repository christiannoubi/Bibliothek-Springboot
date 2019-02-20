package de.adorsys.bibliothek.service;

import de.adorsys.bibliothek.domain.Buch;
import de.adorsys.bibliothek.repository.BuchRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuchService {

    @Autowired
    BuchRepository buchRepository;

    public List<Buch> getAllBuecher () { return buchRepository.findAll();}

    public Optional<Buch> getSingleBuch(Long id) { return buchRepository.findById(id);}
    public Buch save(Buch buch) {
        return buchRepository.save(buch);
    }

    public void deleteBuch (Long id){
        Buch buch = buchRepository.findById(id).orElse(new Buch());
        buchRepository.delete(buch);
    }
    public Optional<Buch> findById(Long id){
        return buchRepository.findById(id);
    }
    public Buch updateBuch (Long id, Buch buch) {
        Optional<Buch> entity = findById(id);
        if (!entity.isPresent()) {
            throw new RuntimeException("Unable to update. Buch with id " + id + " not found.");
        }
        Buch buchEntity = entity.get();
        buchEntity.setName(buch.getName());
        buchEntity.setErscheinungsJahr(buch.getErscheinungsJahr());
        buchEntity.setVerlag(buch.getVerlag());
        buchEntity.setArt(buch.getArt());
        buchRepository.save(buchEntity);
        return buchEntity;
    }
}

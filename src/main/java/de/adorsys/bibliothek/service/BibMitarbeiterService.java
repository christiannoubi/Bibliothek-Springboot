package de.adorsys.bibliothek.service;

import de.adorsys.bibliothek.domain.BibMitarbeiter;
import de.adorsys.bibliothek.repository.BibMitarbeiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibMitarbeiterService {


    @Autowired
    BibMitarbeiterRepository bibMitarbeiterRepository;

    public List<BibMitarbeiter> getAllBibMitarbeiter () { return bibMitarbeiterRepository.findAll();}

    public Optional<BibMitarbeiter> getSingleBibMitarbeiter(Long id) { return bibMitarbeiterRepository.findById(id);}
    public BibMitarbeiter save(BibMitarbeiter bibMitarbeiter) {
        return bibMitarbeiterRepository.save(bibMitarbeiter);
    }

    public void deleteBibMitarbeiter (Long id){
        BibMitarbeiter bibMitarbeiter = bibMitarbeiterRepository.findById(id).orElse(new BibMitarbeiter());
        bibMitarbeiterRepository.delete(bibMitarbeiter);
    }
    public Optional<BibMitarbeiter> findById(Long id){
        return bibMitarbeiterRepository.findById(id);
    }
    public BibMitarbeiter updateBibMitarbeiter (Long id, BibMitarbeiter bibMitarbeiter) {
        Optional<BibMitarbeiter> entity = findById(id);
        if (!entity.isPresent()) {
            throw new RuntimeException("Unable to update. BibMitarbeiter with id " + id + " not found.");
        }
        BibMitarbeiter bibMitarbeiterEntity = entity.get();
        bibMitarbeiterEntity.setName(bibMitarbeiter.getName());
        bibMitarbeiterEntity.setAdresse(bibMitarbeiter.getLage());
        bibMitarbeiterEntity.setLage(bibMitarbeiter.getEmail());
        bibMitarbeiterEntity.setEmail(bibMitarbeiter.getEmail());
        bibMitarbeiterEntity.setTelefonnummer(bibMitarbeiter.getTelefonnummer());
        bibMitarbeiterRepository.save(bibMitarbeiterEntity);
        return bibMitarbeiterEntity;
    }
}

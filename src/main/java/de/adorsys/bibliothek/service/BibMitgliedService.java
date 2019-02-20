package de.adorsys.bibliothek.service;

import de.adorsys.bibliothek.domain.BibMitglied;
import de.adorsys.bibliothek.repository.BibMitgliedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibMitgliedService {


    @Autowired
    BibMitgliedRepository bibMitgliedRepository;

    public List<BibMitglied> getAllBibMitglied () { return bibMitgliedRepository.findAll();}

    public Optional<BibMitglied> getSingleBibMitglied(Long id) { return bibMitgliedRepository.findById(id);}
    public BibMitglied save(BibMitglied bibMitglied) {
        return bibMitgliedRepository.save(bibMitglied);
    }

    public void deleteBibMitglied (Long id){
        BibMitglied bibMitglied = bibMitgliedRepository.findById(id).orElse(new BibMitglied());
        bibMitgliedRepository.delete(bibMitglied);
    }
    public Optional<BibMitglied> findById(Long id){
        return bibMitgliedRepository.findById(id);
    }
    public BibMitglied updateBibMitglied (Long id, BibMitglied bibMitglied) {
        Optional<BibMitglied> entity = findById(id);
        if (!entity.isPresent()) {
            throw new RuntimeException("Unable to update. BibMitglied with id " + id + " not found.");
        }
        BibMitglied bibMitgliedEntity = entity.get();
        bibMitgliedEntity.setName(bibMitglied.getName());
        bibMitgliedEntity.setAdresse(bibMitglied.getAdresse());
        bibMitgliedRepository.save(bibMitgliedEntity);
        return bibMitgliedEntity;
    }
}

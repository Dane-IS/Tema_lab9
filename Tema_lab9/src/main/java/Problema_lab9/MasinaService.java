package Problema_lab9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.List;

@Service
public class MasinaService {

    private final MasinaRepository masinaRepository;

    public MasinaService(MasinaRepository masinaRepository) {
        this.masinaRepository = masinaRepository;
    }

    public Masina adaugaMasina(Masina masina) {
        return masinaRepository.save(masina);
    }

    public void stergeMasina(String numarInmatriculare) {
        Masina masina = masinaRepository.findByNumarInmatriculare(numarInmatriculare);
        if (masina != null) {
            masinaRepository.delete(masina);
        } else {
            throw new IllegalArgumentException("Mașina cu numărul de înmatriculare " + numarInmatriculare + " nu există.");
        }
    }

    public Masina gasesteMasina(String numarInmatriculare) {
        return masinaRepository.findByNumarInmatriculare(numarInmatriculare);
    }

    public Iterable<Masina> toateMasinile() {
        return masinaRepository.findAll();
    }

    public int numarMasiniDupaMarca(String marca) {
        return masinaRepository.countByMarca(marca);
    }

    public int numarMasiniSub100kKm() {
        return masinaRepository.countByKilometriLessThan(100000);
    }

    public List<Masina> masiniMaiNoiDe5Ani() {
        return masinaRepository.findMasiniMaiNoiDe5Ani();
    }
}

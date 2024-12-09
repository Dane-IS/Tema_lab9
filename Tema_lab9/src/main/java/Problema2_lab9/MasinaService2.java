package Problema2_lab9;

import Problema_lab9.Masina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

@Service
public class MasinaService2 {

    private final MasinaRepository2 masinaRepository2;

    public MasinaService2(MasinaRepository2 masinaRepository) {
        this.masinaRepository2 = masinaRepository;
    }

    public Masina adaugaMasina(Masina masina) {
        return masinaRepository2.save(masina);
    }

    public void stergeMasina(String numarInmatriculare) {
        Masina masina = masinaRepository2.findByNumarInmatriculare(numarInmatriculare);
        if (masina != null) {
            masinaRepository2.delete(masina);
        } else {
            throw new IllegalArgumentException("Mașina cu numărul de înmatriculare " + numarInmatriculare + " nu există.");
        }
    }

    public Masina gasesteMasina(String numarInmatriculare) {
        return masinaRepository2.findByNumarInmatriculare(numarInmatriculare);
    }

    public List<Masina> toateMasinile() {
        return (List<Masina>) masinaRepository2.findAll();
    }

    public int numarMasiniDupaMarca(String marca) {
        return masinaRepository2.countByMarca(marca);
    }

    public int numarMasiniSub100kKm() {
        return masinaRepository2.countByKilometriLessThan(100000);
    }

}

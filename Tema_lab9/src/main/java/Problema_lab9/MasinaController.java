package Problema_lab9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/api/masini")
public class MasinaController {

    private final MasinaService masinaService;

    public MasinaController(MasinaService masinaService) {
        this.masinaService = masinaService;
    }

    @PostMapping
    public Masina adaugaMasina(@RequestBody Masina masina) {
        return masinaService.adaugaMasina(masina);
    }

    @DeleteMapping("/{numarInmatriculare}")
    public void stergeMasina(@PathVariable String numarInmatriculare) {
        masinaService.stergeMasina(numarInmatriculare);
    }

    @GetMapping("/{numarInmatriculare}")
    public Masina gasesteMasina(@PathVariable String numarInmatriculare) {
        return masinaService.gasesteMasina(numarInmatriculare);
    }

    @GetMapping
    public Iterable<Masina> toateMasinile() {
        return masinaService.toateMasinile();
    }

    @GetMapping("/numar-marca")
    public int numarMasiniDupaMarca(@RequestParam String marca) {
        return masinaService.numarMasiniDupaMarca(marca);
    }

    @GetMapping("/sub-100k")
    public int numarMasiniSub100kKm() {
        return masinaService.numarMasiniSub100kKm();
    }

    @GetMapping("/mai-noi-de-5-ani")
    public List<Masina> masiniMaiNoiDe5Ani() {
        return masinaService.masiniMaiNoiDe5Ani();
    }
}

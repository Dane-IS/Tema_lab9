package Problema2_lab9;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MasinaRepository2 extends CrudRepository<Problema_lab9.Masina, Long> {

    Problema_lab9.Masina findByNumarInmatriculare(String numarInmatriculare);

    @Query("SELECT COUNT(*) FROM masina WHERE marca = :marca")
    int countByMarca(String marca);

    @Query("SELECT COUNT(*) FROM masina WHERE kilometri < :kilometri")
    int countByKilometriLessThan(int kilometri);

    @Query("SELECT * FROM masina WHERE an_fabricatie > YEAR(CURDATE()) - 5")
    List<Problema_lab9.Masina> findMasiniMaiNoiDe5Ani();
}



package Problema_lab9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class AplicatieDemo
{


    private static final Logger logger = LoggerFactory.getLogger(AplicatieDemo.class);

    public static void main(String[] args) {

        SpringApplication.run(AplicatieDemo.class, args);


        System.out.println("Aplicația a pornit");
        logger.info("Aplicația a pornit");


        Masina masinaTest = new Masina();
        masinaTest.setNumarInmatriculare("MN-012-OP");
        masinaTest.setMarca("Toyota");
        masinaTest.setAnFabricatie(2018);
        masinaTest.setCuloare("Albastru");
        masinaTest.setKilometri(80000);


        System.out.println("Adaugare masina: " + masinaTest);
        logger.info("Adaugare masina: {}", masinaTest);

    }

    @Override
    public String toString() {
        return "Aplicatie Demo{}";
    }
}

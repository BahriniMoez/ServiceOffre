package com.iset.serviceoffreemploi2;

import com.iset.serviceoffreemploi2.dao.OffreRepository;
import com.iset.serviceoffreemploi2.entities.Offre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceOffreEmploi2Application implements CommandLineRunner {

    private final OffreRepository offreRepository;

    public ServiceOffreEmploi2Application(OffreRepository offreRepository) {
        this.offreRepository = offreRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceOffreEmploi2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        offreRepository.save(new Offre("Web Design","informatique","AXA",2,"France"));
        offreRepository.save(new Offre("Developpeur", "informatique","Talys", 3, "Tunisie"));
        offreRepository.save(new Offre("Architecte", "informatique","SIS", 2, "Allemagne"));
    }
}

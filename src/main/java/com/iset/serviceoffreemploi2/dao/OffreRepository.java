package com.iset.serviceoffreemploi2.dao;

import com.iset.serviceoffreemploi2.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepository extends JpaRepository<Offre, Long> {
}

package br.com.r25ta.spiritual_care_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.r25ta.spiritual_care_backend.model.Goer;

@Repository
public interface GoerRepository extends JpaRepository<Goer, Long>{
    List<Goer> findAll();
}

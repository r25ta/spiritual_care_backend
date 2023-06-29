package br.com.r25ta.spiritual_care_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.r25ta.spiritual_care_backend.model.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long>{
   List<Worker> findAll();
}

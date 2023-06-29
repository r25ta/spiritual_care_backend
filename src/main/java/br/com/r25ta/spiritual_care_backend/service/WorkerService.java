package br.com.r25ta.spiritual_care_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.r25ta.spiritual_care_backend.model.Worker;
import br.com.r25ta.spiritual_care_backend.repository.WorkerRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class WorkerService {
    private WorkerRepository workerRepository;

    public List<Worker> getAllWorker(){
        return workerRepository.findAll();
    }
}
